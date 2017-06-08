package gs1.minho.controller;

import gs1.minho.annotation.RegisterAnnotation;
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
    private Method[] viewMethodTable;

    public Controller() {
        view = new EmployeeView();
        service = new EmployeeService();
        serviceMethodTable = new HashMap<>();
        viewMethodTable = new Method[EmployeeView.class.getDeclaredMethods().length];
        for(Method method : EmployeeView.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(RegisterAnnotation.class)) {
                viewMethodTable[method.getAnnotation(RegisterAnnotation.class).value()] = method;
            }
        }

        for(Method method : EmployeeService.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(RegisterAnnotation.class)) {
                serviceMethodTable.put(method.getAnnotation(RegisterAnnotation.class).serviceMethod(), method);
            }
        }
    }

    public void start() {
        while(true) {
            int selected = view.ShowMenu();
            try {
                Object request = viewMethodTable[selected].invoke(view);
                //System.out.print(((Request)request).getRequestName());
                processRequest((Request) request);
            } catch (Exception e) {

            }
        }
    }

    private void processRequest(Request request) {
        try {
            Object object = serviceMethodTable.get(request.getRequestName()).invoke(service, request);
            if(object != null) {
                view.completeMessage((Emplyee)object);
            }
        } catch (Exception e) {

        }
    }
}