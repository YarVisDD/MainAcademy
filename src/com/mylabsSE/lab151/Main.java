package com.mylabsSE.lab151;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        MyClass mycls=new MyClass(5,1,6,9);
       final Class<?>cls=mycls.getClass();
       int mods=cls.getModifiers();
        System.out.println("Modifiers:");
        if(Modifier.isPrivate(mods)) System.out.println("Private");
        if(Modifier.isPublic(mods)) System.out.println("Public");
        if(Modifier.isProtected(mods)) System.out.println("Protected");
        Field[] fields=cls.getDeclaredFields();
        for(Field field:fields){

            Class<?>fType=field.getType();
            System.out.println("Name:"+field.getName());
            System.out.println("Type:"+fType.getName());

        }
        try{
            Class<?>[]paramT=new Class<?>[]{int.class};
            Method method=cls.getMethod("setA",paramT);
            Object[] argss=new Object[]{Integer.valueOf(33)};
            method.invoke(mycls,argss);
            System.out.println("Value:"+mycls.getA());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Constructor<?>[]constructors=cls.getConstructors();
        int i=0;
        for(Constructor<?>ctr:constructors){
            System.out.print("Constructor"+(i++)+": ");
            Class<?>[]prm=ctr.getParameterTypes();
            for(Class<?>prmt:prm){
                System.out.println(prmt.getName()+" ");
            }
            System.out.println();
        }
        Method[]methods=cls.getMethods();
        for(Method method:methods){
            System.out.println("Name:"+ method.getName());
            System.out.println("ReturnType:"+ method.getReturnType().getName());
            Class<?>[] prmt=method.getParameterTypes();
            System.out.print("Param types:");
            for(Class<?>prm:prmt){
                System.out.println(" "+prm.getName());

            }
            System.out.println();
        }
    }
}
