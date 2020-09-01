<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>


<AnchorPane prefHeight="490.0" prefWidth="650.0" xmlns="http://javafx.com/javafx/10.0.2-internal" xmlns:fx="http://javafx.com/fxml/1" fx:controller="Main.AddProduct">
   <children>
      <Label layoutX="14.0" layoutY="14.0" text="Add Product" />
      <Label layoutX="20.0" layoutY="55.0" text="ID" />
      <Label layoutX="20.0" layoutY="90.0" text="Name" />
      <Label layoutX="20.0" layoutY="125.0" text="Inventory" />
      <Label layoutX="20.0" layoutY="160.0" text="Price" />
      <Label layoutX="20.0" layoutY="195.0" text="Min" />
      <Label layoutX="20.0" layoutY="230.0" text="Max" />
      <TextField layoutX="82.0" layoutY="51.0" prefHeight="26.0" prefWidth="83.0" />
      <TextField layoutX="82.0" layoutY="86.0" prefHeight="26.0" prefWidth="127.0" />
      <TextField layoutX="82.0" layoutY="121.0" prefHeight="26.0" prefWidth="70.0" />
      <TextField layoutX="82.0" layoutY="156.0" prefHeight="26.0" prefWidth="70.0" />
      <TextField layoutX="82.0" layoutY="191.0" prefHeight="26.0" prefWidth="70.0" />
      <TextField layoutX="82.0" layoutY="226.0" prefHeight="26.0" prefWidth="70.0" />
      <TextField layoutX="321.0" layoutY="23.0" />
      <Button layoutX="493.0" layoutY="23.0" mnemonicParsing="false" text="Search" />
      <TableView layoutX="253.0" layoutY="55.0" prefHeight="135.0" prefWidth="370.0">
        <columns>
          <TableColumn prefWidth="97.199951171875" text="Part ID" />
          <TableColumn prefWidth="113.5999755859375" text="Part Name" />
            <TableColumn prefWidth="79.20004272460938" text="Inventory" />
            <TableColumn prefWidth="79.4000244140625" text="Price" />
        </columns>
      </TableView>
      <TableView layoutX="253.0" layoutY="254.0" prefHeight="135.0" prefWidth="370.0">
        <columns>
          <TableColumn prefWidth="97.199951171875" text="Part ID" />
          <TableColumn prefWidth="110.0" text="Part Name" />
            <TableColumn prefWidth="81.60006713867188" text="Inventory" />
            <TableColumn prefWidth="82.79998779296875" text="Price" />
        </columns>
      </TableView>
      <Button layoutX="572.0" layoutY="204.0" mnemonicParsing="false" text="Add" />
      <Button layoutX="572.0" layoutY="402.0" mnemonicParsing="false" text="Delete" />
      <Button layoutX="360.0" layoutY="445.0" mnemonicParsing="false" text="Save" />
      <Button layoutX="438.0" layoutY="445.0" mnemonicParsing="false" text="Cancel" />
   </children>
</AnchorPane>
