/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя 
 * StringBuilder. Данные для фильтрации приведены ниже 
 * в виде json-строки.
 */
package lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder sql = new StringBuilder("select * from students where ");

        Pattern pattern = Pattern.compile("\"(.*?)\":\"(.*?)\"");
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);

            if (!value.equals("null")) {
                sql.append(key).append(" = '").append(value).append("' AND ");
            }
        }

        
        if (sql.toString().endsWith("AND ")) {
            sql.setLength(sql.length() - 4);
        }

        System.out.println(sql.toString());
    }
}
