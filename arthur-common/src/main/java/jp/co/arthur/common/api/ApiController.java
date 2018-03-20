package jp.co.arthur.common.api;

/*@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
@Scope("request")*/
public @interface ApiController {

	String value() default "";

}
