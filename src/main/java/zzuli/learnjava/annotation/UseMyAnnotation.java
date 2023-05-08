package zzuli.learnjava.annotation;

/**
 * @Author Crean Culty
 * @date 2023/4/22
 * @time 17:31
 * description:
 */
public class UseMyAnnotation {
    @MyAnnotation(name="songyitian")
    private String name;
    @MyAnnotation
    private String username;

    public UseMyAnnotation(String name, String username) {
        this.name = name;
        this.username = username;
    }
}
