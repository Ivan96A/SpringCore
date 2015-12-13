package Ch4;

/**
 * Created by Iwan on 12.12.2015.
 */
public class ConstructorInjection {
    private Dependency dependency;
       public void setDependency(Dependency dependency) {
           this.dependency = dependency;
       }
}
