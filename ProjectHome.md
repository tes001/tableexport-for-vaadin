This takes a Table as input and exports a decent Excel file containing the data in the Container.  It also handles HierarchicalContainers and the resulting Excel file will have the categories and subcategories properly grouped/outlined.

There are a number of configurable properties.  The user can specify a worksheet name, a report title, and an output file name.  The user can also specify if there should be a Totals row at the bottom of the export.  The user can pass in custom POI CellStyles.  However, if none of these are specified, the user only needs to pass in a Table.

This add-on requires the Apache POI library.