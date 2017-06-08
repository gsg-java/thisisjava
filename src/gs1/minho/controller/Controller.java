package gs1.minho.controller;

import gs1.minho.annotation.RequestView;
import gs1.minho.annotation.ResponseView;
import gs1.minho.annotation.Service;
import gs1.minho.exception.AlreadyExistingEmployeeException;
import gs1.minho.model.Emplyee;
import gs1.minho.request.Request;
import gs1.minho.service.EmployeeService;
import gs1.minho.view.EmployeeView;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

/**
 *
 * Created by minho on 2017. 6. 7..
 */

public class Controller {
    private EmployeeView view;
    private EmployeeService service;
    private Map<String, Method> serviceMethodTable;
    private Method[] requestViewMethodTable;
    private Map<String, Method> resposseViewMethodTable;

    public Controller() {
        view = new EmployeeView();
        service = new EmployeeService();
        serviceMethodTable = new HashMap<>();
        requestViewMethodTable = new Method[EmployeeView.class.getDeclaredMethods().length];
        resposseViewMethodTable = new HashMap<>();

        for(Method method : EmployeeView.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(RequestView.class)) {
                requestViewMethodTable[method.getAnnotation(RequestView.class).value()] = method;
            }
        }

        for(Method method : EmployeeView.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(ResponseView.class)) {
                resposseViewMethodTable.put(method.getAnnotation(ResponseView.class).request(), method);
            }
        }

        for(Method method : EmployeeService.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Service.class)) {
                serviceMethodTable.put(method.getAnnotation(Service.class).method(), method);
            }
        }
    }

    public void start() {
        while(true) {
            int selected = view.showMenu();
            try {
                Object request = requestViewMethodTable[selected].invoke(view);
//                System.out.print(((Request)request).getRequestName());
                processRequest((Request) request);
            } catch (Exception e) {

            }
        }
    }

    private void processRequest(Request request) {
        try {
            String requestName = request.getRequestName();
//            System.out.print(requestName);
            Object object = serviceMethodTable.get(requestName).invoke(service, request);
            if(object != null) {
                resposseViewMethodTable.get(requestName).invoke(view, object);
            }
        } catch (AlreadyExistingEmployeeException e) {
        } catch (Exception e) {
        }
    }
}