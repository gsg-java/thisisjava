package gs1.minho.controller;

import gs1.kingbbode.common.domain.Menu;
import gs1.minho.annotation.ErrorView;
import gs1.minho.annotation.RequestView;
import gs1.minho.annotation.ResponseView;
import gs1.minho.annotation.Service;
import gs1.minho.request.Request;
import gs1.minho.service.EmployeeService;
import gs1.minho.view.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

/**
 *
 * Created by minho on 2017. 6. 7..
 */

//컨트롤러는 뷰와 서비스 객체의 메서드 테이블을 유지하며 둘 사이를 컨트롤
public class Controller {
    private EMMenuView menuView;
    private EMRequestView requestView;
    private EMResponseView responseView;
    private EMErrorView errorView;
    private EmployeeService service;
    private Map<String, Method> serviceMethodMap;
    private Method[] requestViewMethodArray;
    private Map<String, Method> responseViewMethodMap;
    private Map<String, Method> errorViewMethodMap;

    public Controller() {
        initViews();
        initService();
        initMaps();
    }

    private void initViews() {
        menuView = new EMMenuView();
        requestView = new EMRequestView();
        responseView = new EMResponseView();
        errorView = new EMErrorView();
    }

    private void initMaps() {
        serviceMethodMap = new HashMap<>();
        responseViewMethodMap = new HashMap<>();
        errorViewMethodMap = new HashMap<>();
        requestViewMethodArray = new Method[EMRequestView.class.getDeclaredMethods().length];
        for(Method method : EMResponseView.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ResponseView.class)) {
                responseViewMethodMap.put(method.getAnnotation(ResponseView.class).request(), method);
            }
        }
        for(Method method : EMRequestView.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RequestView.class)) {
                requestViewMethodArray[method.getAnnotation(RequestView.class).value()] = method;
            }
        }

        for(Method method: EMErrorView.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(ErrorView.class)) {
                errorViewMethodMap.put(method.getAnnotation(ErrorView.class).request(), method);
            }
        }

        for(Method method : EmployeeService.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Service.class)) {
                serviceMethodMap.put(method.getAnnotation(Service.class).method(), method);
            }
        }
    }


    private void initService() {
        service = new EmployeeService();
    }

    public void start() {
        while(true) {
            int selected = menuView.showMenu();
            try {
                Object request = requestViewMethodArray[selected].invoke(requestView);
                processRequest((Request) request);
            } catch (Exception e) {
            }
        }
    }

    private void processRequest(Request request) {
        String requestName = request.getRequestName();
        try {
            Object object = serviceMethodMap.get(requestName).invoke(service, request);
            if(object == null) {
                errorViewMethodMap.get(requestName).invoke(errorView, request);
            } else {
                responseViewMethodMap.get(requestName).invoke(responseView, object);
            }
        } catch (InvocationTargetException e) {
        } catch (IllegalAccessException e) {
        }
    }
}