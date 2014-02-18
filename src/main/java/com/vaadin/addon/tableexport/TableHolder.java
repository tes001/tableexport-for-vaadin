package com.vaadin.addon.tableexport;

import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.ui.UI;
import java.util.List;

/**
 *
 * @author thomas
 */
public interface TableHolder {

    List<Object> getPropIds();
    boolean isHierarchical();
    void setHierarchical(final boolean hierarchical);
    
    Short getCellAligment(Object propId);
    boolean isGeneratedColumn(final Object propId) throws IllegalArgumentException;
    Class<?> getPropertyTypeForGeneratedColumn(final Object propId) throws IllegalArgumentException;
    Property getPropertyForGeneratedColumn(final Object propId, final Object rootItemId) throws IllegalArgumentException;
    
    // table delegated methods
    boolean isColumnCollapsed(Object propertyId);
    UI getUI();
    String getColumnHeader(Object propertyId);
    Container getContainerDataSource();
    boolean isExportableFormatedProperty();
    String getFormattedPropertyValue(Object rowId, Object colId, Property property);
}