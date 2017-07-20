

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

// TODO: Auto-generated Javadoc
/**
 * The Interface Layout.
 */
public interface Layout {
   
   /**
    * Adds the layout component.
    *
    * @param name the name
    * @param comp the comp
    */
   void addLayoutComponent(String name, Component comp);
   
   /**
    * Layout size.
    *
    * @param contain the contain
    * @return the dimension
    */
   Dimension LayoutSize(Container contain);
   
   /**
    * Removal layout component.
    */
   void removalLayoutComponent();
}
