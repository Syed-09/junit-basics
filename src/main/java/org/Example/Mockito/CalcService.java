package org.Example.Mockito;

public class CalcService {
    private static AddService addService;

    public CalcService( AddService addService){
        this.addService = addService;
    }

    public static int calculate(int n1, int n2){
        System.out.println("## CalcService Executed ##");
        return addService.add(n1,n2);
    }




}
