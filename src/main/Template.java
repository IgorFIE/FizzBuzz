package main;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.Entry;

/**
 * Created by pacifist on 28-11-2016.
 */
public class Template {

    private Map<String,String> variables;
    private String templateText;

    public Template(String templateText) {
        this.variables = new HashMap<>();
        this.templateText = templateText;
    }

    public String evaluate() {
        String result = templateText;

        for (Entry<String,String> entry : variables.entrySet()) {
            String regex = "\\$\\{" + entry.getKey() + "\\}";
            result = result.replaceAll(regex, entry.getValue());
        }
        return result;
    }

    public void set(String variable, String value) {
        this.variables.put(variable,value);
    }
}
