package Ch4;

import java.awt.*;

/**
 * Created by Iwan on 12.12.2015.
 */
public class ContextualizeDependencyLookup implements ManagedComponent {
    private Dependency dependency;

     public void performLookup(Container container) {
         this.dependency = (Dependency) container.getDependency("myDependency");
     }
}
