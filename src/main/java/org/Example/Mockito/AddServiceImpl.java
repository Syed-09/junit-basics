package org.Example.Mockito;

public class AddServiceImpl implements AddService{
    @Override
    public int add(int n1, int n2) {
        System.out.println("## AddServiceImpl Executed ##");
        return n1+n2;
    }
}