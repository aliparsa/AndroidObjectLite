package com.idealab.androidobjectlite.utilities;

import android.util.Log;

import java.lang.reflect.Field;
import java.util.IllegalFormatException;
import java.util.List;

/**
 * Created by Ashkan on 14/10/10.
 */
public class SqlHelper {


    public static String generateCreateTableQuery(Object obj)throws IllegalAccessException, IllegalFormatException {

        List<Field> fields = ReflectionHelper.getFieldsOfClass(obj.getClass());

        for (int i = 0; i < fields.size(); i++) {

            Field field = fields.get(i);
            field.setAccessible(true);

            Log.i("ashkan", "filed \"" + field.getName() +  "\" is \"" + ReflectionHelper.getFieldType(field).toString() + "\" and its value is \"" + field.get(obj).toString() + "\""   );
        }

        return "";
    }
}
