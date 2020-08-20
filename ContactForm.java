import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ContactForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();
        Rectangle rectDarkBlue = new Rectangle(650,700);
        rectDarkBlue.setFill(Paint.valueOf("#03a9f4"));//
        Rectangle rectLightBlue = new Rectangle(650,700);
        rectLightBlue.setFill(Paint.valueOf("#0f3959"));
        rectDarkBlue.setLayoutX(0);
        rectDarkBlue.setLayoutY(0);
        rectLightBlue.setLayoutX(650);
        rectLightBlue.setLayoutY(0);
        Rectangle rectCenter = new Rectangle(1000,550);
        rectCenter.setFill(Paint.valueOf("#fff"));
        rectCenter.setLayoutY(75);
        rectCenter.setLayoutX(220);

        Rectangle rectLeft = new Rectangle(400,500);
        rectLeft.setFill(Paint.valueOf("#0f3959"));
        rectLeft.setLayoutX(100);
        rectLeft.setLayoutY(100);

        Label contactInfo = new Label("Contact Info");
        contactInfo.setId("contactInfo");
        contactInfo.setLayoutX(150);
        contactInfo.setLayoutY(125);

        HBox addressBox = new HBox(6);
        addressBox.setId("addressBox");
        FileInputStream addressLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\pin.png");
        Image addressImage = new Image(addressLogo);
        ImageView logoAddress = new ImageView(addressImage);
        logoAddress.setFitWidth(32);
        logoAddress.setFitHeight(32);
        Label addressLine1 = new Label("2912 Meadowbrook Road");
        Label addressLine2 = new Label("Los Angeles CA");
        Label addressLine3 = new Label("90017");
        addressLine1.setId("address");
        addressLine2.setId("address");
        addressLine3.setId("address");
        VBox address = new VBox(6);
        address.getChildren().addAll(addressLine1,addressLine2,addressLine3);
        addressBox.getChildren().addAll(logoAddress,address);
        addressBox.setLayoutX(125);
        addressBox.setLayoutY(175);

        HBox emailBox = new HBox(6);
        emailBox.setId("emailBox");
        FileInputStream emailLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\mail.png");
        Image emailImage = new Image(emailLogo);
        ImageView LogoEmail = new ImageView(emailImage);
        LogoEmail.setFitHeight(32);
        LogoEmail.setFitWidth(32);
        Label email = new Label("shenal@coderx.com");
        email.setId("email");
        emailBox.getChildren().addAll(LogoEmail,email);
        emailBox.setLayoutY(275);
        emailBox.setLayoutX(125);

        HBox mobileBox = new HBox(6);
        mobileBox.setId("mobileBox");
        FileInputStream mobileLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\phone.png");
        Image mobileImage = new Image(mobileLogo);
        ImageView LogoMobile = new ImageView(mobileImage);
        LogoMobile.setFitHeight(32);
        LogoMobile.setFitWidth(32);
        Label mobile = new Label("0778183950");
        mobile.setId("mobile");
        mobileBox.getChildren().addAll(LogoMobile,mobile);
        mobileBox.setLayoutY(325);
        mobileBox.setLayoutX(125);


        HBox socialMediaBox = new HBox(20);
        socialMediaBox.setId("socialMediaBox");
        FileInputStream faceBookLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\facebook.png");
        FileInputStream twitterLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\twitter.png");
        FileInputStream instagramLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\instagram.png");
        FileInputStream linkedInLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\linkedin.png");
        FileInputStream pinterestLogo = new FileInputStream("D:\\IIT\\Web Test\\Animation Test\\Contact Form 2\\pinterest.png");
        Image faceBookImage = new Image(faceBookLogo);
        Image twitterImage = new Image(twitterLogo);
        Image instagramImage = new Image(instagramLogo);
        Image linkedInImage = new Image(linkedInLogo);
        Image pinterestImage = new Image(pinterestLogo);
        ImageView faceBook = new ImageView(faceBookImage);
        ImageView twitter = new ImageView(twitterImage);
        ImageView instagram = new ImageView(instagramImage);
        ImageView linkedIn = new ImageView(linkedInImage);
        ImageView pinterest = new ImageView(pinterestImage);

        faceBook.setOpacity(0.6);
        faceBook.setOnMouseEntered(e-> faceBook.setOpacity(1));
        faceBook.setOnMouseExited(e-> faceBook.setOpacity(0.6));

        twitter.setOpacity(0.6);
        twitter.setOnMouseEntered(e-> twitter.setOpacity(1));
        twitter.setOnMouseExited(e-> twitter.setOpacity(0.6));

        instagram.setOpacity(0.6);
        instagram.setOnMouseEntered(e-> instagram.setOpacity(1));
        instagram.setOnMouseExited(e-> instagram.setOpacity(0.6));

        linkedIn.setOpacity(0.6);
        linkedIn.setOnMouseEntered(e-> linkedIn.setOpacity(1));
        linkedIn.setOnMouseExited(e-> linkedIn.setOpacity(0.6));

        pinterest.setOpacity(0.6);
        pinterest.setOnMouseEntered(e-> pinterest.setOpacity(1));
        pinterest.setOnMouseExited(e-> pinterest.setOpacity(0.6));

        socialMediaBox.getChildren().addAll(faceBook,twitter,instagram,linkedIn,pinterest);
        socialMediaBox.setLayoutX(200);
        socialMediaBox.setLayoutY(500);

        addressBox.setOpacity(0.6);
        addressBox.setOnMouseEntered(e-> addressBox.setOpacity(1));
        addressBox.setOnMouseExited(e-> addressBox.setOpacity(0.6));

        emailBox.setOpacity(0.6);
        emailBox.setOnMouseEntered(e->emailBox.setOpacity(1));
        emailBox.setOnMouseExited(e->emailBox.setOpacity(0.6));

        mobileBox.setOpacity(0.6);
        mobileBox.setOnMouseEntered(e-> mobileBox.setOpacity(1));
        mobileBox.setOnMouseExited(e-> mobileBox.setOpacity(0.6));


        GridPane gridPane = new GridPane();
        gridPane.setVgap(30);
        gridPane.setHgap(40);
        Label sendMsg = new Label("Send a Message");
        sendMsg.setId("sendMsg");
        TextField txt_FName = new TextField();
        txt_FName.setId("txt");
        txt_FName.setPrefSize(300,35);
        txt_FName.setPromptText("First Name");

        TextField txt_LName = new TextField();
        txt_LName.setId("txt");
        txt_LName.setPrefSize(300,35);
        txt_LName.setPromptText("Last Name");

        TextField txt_email = new TextField();
        txt_email.setId("txt");
        txt_email.setPrefSize(300,35);
        txt_email.setPromptText("Email Address");

        TextField txt_mobile = new TextField();
        txt_mobile.setId("txt");
        txt_mobile.setPromptText("Mobile Number");
        txt_mobile.setPrefSize(300,35);


         TextArea txt_msg = new TextArea();
        txt_msg.setId("txt");
         txt_msg.setPromptText("Write your message here");

        Button sendBtn = new Button("SEND");
        sendBtn.setPrefSize(80,30);
        sendBtn.setOnAction(e-> System.out.println(txt_FName.getText()+" "+txt_LName.getText()+" "+txt_email.getText()
                +" "+txt_mobile.getText()+" "+txt_msg.getText()));
        sendBtn.setId("sendBtn");

        gridPane.add(sendMsg,0,0);
        gridPane.add(txt_FName,0,1);
        gridPane.add(txt_LName,1,1);
        gridPane.add(txt_email,0,2);
        gridPane.add(txt_mobile,1,2);
        gridPane.add(txt_msg,0,3,2,3);
        gridPane.add(sendBtn,0,4,1,10);


        gridPane.setLayoutX(550);
        gridPane.setLayoutY(130);


        anchorPane.getChildren().addAll(rectDarkBlue,rectLightBlue,rectCenter,rectLeft,contactInfo,addressBox,emailBox,mobileBox,
                socialMediaBox,gridPane);

        FileInputStream iconStream = new FileInputStream("C:\\Users\\USER\\Downloads\\form.png");
        Image icon = new Image(iconStream);
        Scene scene = new Scene(anchorPane,1300,700);
        scene.getStylesheets().add("ContactStyle.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Contact Form");
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
