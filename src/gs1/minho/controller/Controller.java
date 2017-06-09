package gs1.minho.controller;

import gs1.minho.annotation.ErrorView;
import gs1.minho.annotation.RequestView;
import gs1.minho.annotation.ResponseView;
import gs1.minho.annotation.Service;
import gs1.minho.request.Request;
import gs1.minho.service.EmployeeService;
import gs1.minho.view.EmployeeView;

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
    private EmployeeView view;
    private EmployeeService service;
    private Map<String, Method> serviceTable;
    private Method[] requestViewTable;
    private Map<String, Method> responseViewTable;
    private Map<String, Method> errorViewTable;

    public Controller() {
        view = new EmployeeView();
        service = new EmployeeService();
        serviceTable = new HashMap<>();
        requestViewTable = new Method[EmployeeView.class.getDeclaredMethods().length];
        responseViewTable = new HashMap<>();
        errorViewTable = new HashMap<>();

        for(Method method : EmployeeView.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(ResponseView.class)) {
                responseViewTable.put(method.getAnnotation(ResponseView.class).request(), method);
            } else if(method.isAnnotationPresent(RequestView.class)) {
                requestViewTable[method.getAnnotation(RequestView.class).value()] = method;
            } else if(method.isAnnotationPresent(ErrorView.class)) {
                errorViewTable.put(method.getAnnotation(ErrorView.class).request(), method);
            }
        }

        for(Method method : EmployeeService.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Service.class)) {
                serviceTable.put(method.getAnnotation(Service.class).method(), method);
            }
        }
    }

    public void start() {
        while(true) {
            int selected = view.showMenu();
            try {
                Object request = requestViewTable[selected].invoke(view);
                processRequest((Request) request);
            } catch (Exception e) {
            }
        }
    }

    private void processRequest(Request request) {
        String requestName = request.getRequestName();
        try {
            Object object = serviceTable.get(requestName).invoke(service, request);
            if(object == null) {
                errorViewTable.get(requestName).invoke(view, request);
            } else {
                responseViewTable.get(requestName).invoke(view, object);
            }
        } catch (InvocationTargetException e) {
        } catch (IllegalAccessException e) {
        }
    }
}