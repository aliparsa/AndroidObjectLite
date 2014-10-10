package com.idealab.androidobjectlite.utilities;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashkan on 14/10/10.
 */
public class ReflectionHelper {


    public static List<Field> getFieldsOfClass(Class classType){

        List<Field> fields = new ArrayList<Field>();

        for(Field filed : classType.getDeclaredFields()){

            fields.add(filed);
        }


        return fields;
    }

    public static FieldType getFieldType(Field filed){


        if(filed.getType().isAssignableFrom(String.class)){

           return FieldType.STRING;
        }

        if(filed.getType().isAssignableFrom(Integer.TYPE)){

            return FieldType.INT;
        }

        if(filed.getType().isAssignableFrom(Double.TYPE)){

            return FieldType.DOUBLE;
        }


        return FieldType.UNDEFINED;
    }



}
