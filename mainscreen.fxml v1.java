<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="470.0" prefWidth="740.0" xmlns="http://javafx.com/javafx/10.0.2-internal" xmlns:fx="http://javafx.com/fxml/1">
   <children>
      <Label layoutX="14.0" layoutY="14.0" text="Inventory Management System">
         <font>
            <Font name="System Bold" size="18.0" />
         </font>
      </Label>
      <AnchorPane layoutX="17.0" layoutY="68.0" prefHeight="360.0" prefWidth="340.0">
         <children>
            <Label layoutX="14.0" layoutY="14.0" prefHeight="20.0" prefWidth="36.0" text="Parts">
               <font>
                  <Font name="System Bold" size="14.0" />
               </font>
            </Label>
            <TextField layoutX="14.0" layoutY="40.0" />
            <Button layoutX="190.0" layoutY="40.0" mnemonicParsing="false" text="Search" />
            <TableView layoutX="14.0" layoutY="80.0" prefHeight="200.0" prefWidth="312.0" fx:id="partsTable">
              <columns>
                <TableColumn prefWidth="75.0" text="Part ID" />
                <TableColumn prefWidth="87.20000457763672" text="Part Name" />
                  <TableColumn prefWidth="77.60003662109375" text="Inventory" />
                  <TableColumn prefWidth="72.4000244140625" text="Price" />
              </columns>
            </TableView>
            <Button layoutX="69.0" layoutY="293.0" mnemonicParsing="false" text="Add" />
            <Button layoutX="136.0" layoutY="293.0" mnemonicParsing="false" text="Modify" />
            <Button layoutX="221.0" layoutY="293.0" mnemonicParsing="false" text="Delete" />
         </children>
      </AnchorPane>
      <AnchorPane layoutX="382.0" layoutY="68.0" prefHeight="360.0" prefWidth="340.0">
         <children>
            <Label layoutX="14.0" layoutY="14.0" text="Products">
               <font>
                  <Font name="System Bold" size="14.0" />
               </font>
            </Label>
            <TextField layoutX="14.0" layoutY="40.0" />
            <Button layoutX="190.0" layoutY="40.0" mnemonicParsing="false" text="Search" />
            <TableView layoutX="14.0" layoutY="80.0" prefHeight="200.0" prefWidth="312.0" fx:id="productsTable">
              <columns>
                <TableColumn prefWidth="75.0" text="Product ID" />
                <TableColumn prefWidth="92.20004272460938" text="Product Name" />
                  <TableColumn prefWidth="65.199951171875" text="Inventory" />
                  <TableColumn prefWidth="77.5999755859375" text="Price" />
              </columns>
            </TableView>
            <Button layoutX="69.0" layoutY="293.0" mnemonicParsing="false" text="Add" />
            <Button layoutX="136.0" layoutY="293.0" mnemonicParsing="false" text="Modify" />
            <Button layoutX="221.0" layoutY="293.0" mnemonicParsing="false" text="Delete" />
         </children>
      </AnchorPane>
      <Button layoutX="680.0" layoutY="430.0" mnemonicParsing="false" text="Exit" />
   </children>
</AnchorPane>
