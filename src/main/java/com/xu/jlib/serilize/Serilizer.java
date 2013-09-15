package com.xu.jlib.serilize;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: xuliu
 * Date: 13-9-13
 * Time: 下午9:10
 * To change this template use File | Settings | File Templates.
 */
public class Serilizer<T> {

    private Class<T> cls;

    private Map<SerialableField, Field> fields;

    public Serilizer(Class<T> cls){

        Annotation[] classDeclaredAnnotations = cls.getDeclaredAnnotations();

        if(classDeclaredAnnotations == null || classDeclaredAnnotations.length == 0 || Arrays.asList(classDeclaredAnnotations).contains(SerialableField.class)){

            throw new SeriableException("class should be annotated with @SerialableField");
        }

        fields = new TreeMap<SerialableField, Field>(new Comparator<SerialableField>() {
            @Override
            public int compare(SerialableField o1, SerialableField o2) {
                return o1.index() - o2.index();
            }
        });

        for (Field field : cls.getDeclaredFields()) {

            SerialableField fieldDeclaredAnnotation = field.getAnnotation(SerialableField.class);


            if(fieldDeclaredAnnotation != null){

                this.fields.put(fieldDeclaredAnnotation, field);
            }

        }





        this.cls = cls;

    }

    private void init(){




    }



    public T from(byte[] bytes) {


        if(bytes == null || bytes.length < 1){

            new SeriableException("The bytes' length must be max than 0. ");
        }

        for(Map.Entry<SerialableField, Field> entry : this.fields.entrySet()){

            SerialableField annotation = entry.getKey();
            Field field = entry.getValue();



            switch (annotation.type()){
                case INT:

                    break;
                case FLOAT:
                    break;
                case STRING:
                    break;
                case CLASS:
                    break;
            }


        }
        return null;
    }

    public byte[] serilize(T t){

        return null;
    }

    public static class SeriableException extends RuntimeException{

        public SeriableException(String msg){
            super(msg);
        }
    }
}
