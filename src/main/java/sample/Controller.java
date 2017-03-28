package sample;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

public class Controller {
    public static Boolean X;
    public static Boolean Y;

    //Created 36 loggers
    static Logger logger = Logger.getLogger(String.valueOf(Controller.class));

    /**Getters and setters*/
    public static Boolean isX(Boolean x) {
        return x;
    }
    public void setX(Boolean x) {
        X = x;
    }
    public static Boolean isY(Boolean y) {
        return y;
    }
    public void setY(Boolean y) {
        Y = y;
    }
    /***/

    String errorMessage = "!ERROR!\n Problem is caused by \"null\" variable";

    @FXML TextArea textArea;

    @FXML ImageView hint1ImageSmall;
    @FXML ImageView hint1ImageBig;
    @FXML ImageView hint2ImageSmall;
    @FXML ImageView hint2ImageBig;

    @FXML MenuButton xMenu;
    @FXML MenuButton yMenu;
    @FXML MenuItem xTrue;
    @FXML MenuItem xFalse;
    @FXML MenuItem xNaN;
    @FXML MenuItem yTrue;
    @FXML MenuItem yFalse;
    @FXML MenuItem yNaN;

    // Menu with X
    @FXML public void xTrueClick(){
        setX(true);
        xMenu.setText("True");
        logger.info("Button X into position - True");
    }
    @FXML public void xFalseClick(){
        setX(false);
        xMenu.setText("False");
        logger.info("Button X into position - False");
    }
    @FXML public void xNaNClick(){
        xMenu.setText("null");
        setX(null);
        logger.info("Button X into position - Null");
    }
    // Menu with Y
    @FXML public void yTrueClick(){
        setY(true);
        yMenu.setText("True");
        logger.info("Button Y into position - True");
    }
    @FXML public void yFalseClick(){
        setY(false);
        yMenu.setText("False");
        logger.info("Button Y into position - False");
    }
    @FXML public void yNaNClick(){
        yMenu.setText("null");
        setY(null);
        logger.info("Button Y into position - Null");
    }

    /** <Button functions> */
    @FXML public void f0ButtonClick() {
        try {
            textArea.setText(X+"(Instant 0)"+Y+" = "+BoolCalculator.f0(X, Y));
            logger.info("You use function - Null");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
    @FXML public void f1ButtonClick() {
        try {
            textArea.setText(X+"^"+Y+" = "+BoolCalculator.f1(X,Y));
            logger.info("You use function - AND");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - AND. But Button X or Y into position - Null");
        }
    }
    @FXML public void f2ButtonClick() {
        try {
            textArea.setText(X+"!→"+Y+" = "+BoolCalculator.f2(X,Y));
            logger.info("You use function - Inhibition");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - Inhibition. But Button X or Y into position - Null");
        }
    }
    @FXML public void f3ButtonClick() {
        try {
            textArea.setText(X+"(Transfer X)"+Y+" = "+BoolCalculator.f3(X,Y));
            logger.info("You use function - TransferX");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - TransferX. But Button X or Y into position - Null");
        }
    }
    @FXML public void f4ButtonClick() {
        try {
            textArea.setText(X+"!←"+Y+" = "+BoolCalculator.f4(X,Y));
            logger.info("You use function - AntiInhibition");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - AntiInhibition. But Button X or Y into position - Null");
        }
    }
    @FXML public void f5ButtonClick() {
        try {
            textArea.setText(X+"(Transfer Y)"+Y+" = "+BoolCalculator.f5(X,Y));
            logger.info("You use function - TransferY");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - TranserY. But Button X or Y into position - Null");
        }
    }
    @FXML public void f6ButtonClick() {
        try {
            textArea.setText(X+"(XOR)"+Y+" = "+BoolCalculator.f6(X,Y));
            logger.info("You use function - Exclusive-OR");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - Exclusive-OR. But Button X or Y into position - Null");
        }
    }
    @FXML public void f7ButtonClick() {
        try {
            textArea.setText(X+"∨"+Y+" = "+BoolCalculator.f7(X,Y));
            logger.info("You use function - OR");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - OR. But Button X or Y into position - Null");
        }
    }
    @FXML public void f8ButtonClick() {
        try {
            textArea.setText(X+"↓"+Y+" = "+BoolCalculator.f8(X,Y));
            logger.info("You use function - NOR");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - NOR. But Button X or Y into position - Null");
        }
    }
    @FXML public void f9ButtonClick() {
        try {
            textArea.setText(X+"↔"+Y+" = "+BoolCalculator.f9(X,Y));
            logger.info("You use function - Equivalence");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - Equivalence. But Button X or Y into position - Null");
        }
    }
    @FXML public void f10ButtonClick() {
        try {
            textArea.setText(X+"(Not Y)"+Y+" = "+BoolCalculator.f10(X,Y));
            logger.info("You use function - ComplementY");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - ComplementY. But Button X or Y into position - Null");
        }
    }
    @FXML public void f11ButtonClick() {
        try {
            textArea.setText(X+"←"+Y+" = "+BoolCalculator.f11(X,Y));
            logger.info("You use function - Implication");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - Implication. But Button X or Y into position - Null");
        }
    }
    @FXML public void f12ButtonClick() {
        try {
            textArea.setText(X+"(Not X)"+Y+" = "+BoolCalculator.f12(X,Y));
            logger.info("You use function - ComplementX");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - ComplementX. But Button X or Y into position - Null");
        }
    }
    @FXML public void f13ButtonClick() {
        try {
            textArea.setText(X+"→"+Y+" = "+BoolCalculator.f13(X,Y));
            logger.info("You use function - AntiImplication");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - AntiImplication. But Button X or Y into position - Null");
        }
    }
    @FXML public void f14ButtonClick() {
        try {
            textArea.setText(X+"↑"+Y+" = "+BoolCalculator.f14(X,Y));
            logger.info("You use function - NotAND");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
            logger.info("You use function - NotAND. But Button X or Y into positin - Null");
        }
    }
    @FXML public void f15ButtonClick() {
        try {
            textArea.setText(X+"(Instant 1)"+Y+" = "+BoolCalculator.f15(X,Y));
            logger.info("You use function - Identity");
        }
        catch (NullPointerException e){
            textArea.setText(errorMessage);
        }
    }
}