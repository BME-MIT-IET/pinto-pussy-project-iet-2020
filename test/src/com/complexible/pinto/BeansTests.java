package com.complexible.pinto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Date;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.complexible.common.beans.Beans;

public class BeansTests{

    @Test
    public void isPrimitiveClassTest(){
        assertEquals(true,Beans.isPrimitive(Integer.class));
        assertEquals(true,Beans.isPrimitive(Boolean.class));
        assertEquals(true,Beans.isPrimitive(Long.class));
        assertEquals(true,Beans.isPrimitive(Short.class));
        assertEquals(true,Beans.isPrimitive(Double.class));
        assertEquals(true,Beans.isPrimitive(Float.class));
        assertEquals(true,Beans.isPrimitive(Date.class));
        assertEquals(true,Beans.isPrimitive(String.class));
        assertEquals(true,Beans.isPrimitive(Character.class));
        assertEquals(true,Beans.isPrimitive(java.net.URI.class));
    }

    @Test
    public void isPrimitiveObjectTest(){
        assertEquals(true,Beans.isPrimitive(new Integer(1)));
        assertEquals(true,Beans.isPrimitive(new Boolean(true)));
        assertEquals(true,Beans.isPrimitive(new Long(1)));
        assertEquals(true,Beans.isPrimitive(new Short("1")));
        assertEquals(true,Beans.isPrimitive(new Double(1)));
        assertEquals(true,Beans.isPrimitive(new Float(1)));
        assertEquals(true,Beans.isPrimitive(new Date()));
        assertEquals(true,Beans.isPrimitive(new String("")));
        assertEquals(true,Beans.isPrimitive(new Character('A')));
        java.net.URI uri=null;
        try {
          uri=new java.net.URI("");
        } catch (Exception e) {
          //TODO: handle exception
        }
        assertEquals(true,Beans.isPrimitive(uri));
    }

    @Test
    public void getDeclaredFieldsTest(){
      int i=0;
        Iterable<Field> fields = Beans.getDeclaredFields(BeansTests.class);
        for(Field field:fields){
          i++;
        }
        assertEquals(1,i);
    }

    @Test
    public void getDeclaredMethodsTest(){
      int i=0;
        Iterable<Method> methods = Beans.getDeclaredMethods(BeansTests.class);
        for(Method method:methods){
          i++;
        }
        assertEquals(17,i);
    }
}