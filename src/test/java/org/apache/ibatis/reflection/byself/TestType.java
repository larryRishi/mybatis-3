package org.apache.ibatis.reflection.byself;

import org.apache.ibatis.reflection.TypeParameterResolver;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author liuhx
 * @desc TODO
 * @date 2019/7/13
 **/
public class TestType {

    SubClassA<Long> sa = new SubClassA<>();

    public static void main(String[] args) throws Exception {
        Field field = ClassA.class.getDeclaredField("map");
        System.out.println(field.getGenericType());
        System.out.println(field.getGenericType() instanceof ParameterizedType);

        Type type = TypeParameterResolver.resolveFieldType(field,
                ParameterizedTypeImpl.make(SubClassA.class, new Type[]{Long.class}, TestType.class));

        System.out.println(type.getClass());
    }

}
