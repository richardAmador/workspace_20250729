String var_1 = vars.get("id")
String template = (String) props.get("get_by_id")
String var_2 = template.replace("#id#", var_1)
vars.put("final_path", var_2)
