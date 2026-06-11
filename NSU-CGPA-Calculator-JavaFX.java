//select all data correctly to use the calculator properly and get results as well as save in StudentInfo file//

/*project team:
	
	Name:Mahmodul Hasan Jobayer
	ID: 2021910642
	Section: 10
*/

package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	String val1="";
	String val2="";
	String val3="";
	String val4="";
	String val5="";
	
	String valc1="";
	String valc2="";
	String valc3="";
	String valc4="";
	String valc5="";
	
	String valg1="";
	String valg2="";
	String valg3="";
	String valg4="";
	String valg5="";
	
	double cg1,cg2,cg3,cg4,cg5;
	
	@Override
	public void start(Stage primaryStage) {
		
		Label lb=new Label("#####_____|||||---CGPA CALCULATOR---|||||_____#####");
		Label lb0=new Label("---NORTH SOUTH UNIVERSITY---");
		Label lbn=new Label("Student Name: ");
		Label lbi=new Label("Student ID: ");
		Label clb=new Label("COURSE NAME");
		Label clb1=new Label("Course1: ");
		Label clb2=new Label("Course2: ");
		Label clb3=new Label("Course3: ");
		Label clb4=new Label("Course4: ");
		Label clb5=new Label("Course5: ");
		Label cdlb=new Label("CREDIT");
		Label glb=new Label("CGPA");
		
		TextField tfn=new TextField();
		TextField tfi=new TextField();
		
		
		Button calculate=new Button("Calculate CGPA");
		
		ComboBox<String> com1=new ComboBox<>();
		ComboBox<String> com2=new ComboBox<>();
		ComboBox<String> com3=new ComboBox<>();
		ComboBox<String> com4=new ComboBox<>();
		ComboBox<String> com5=new ComboBox<>();
		
		com1.getItems().addAll("ENG102","ENG103","ENG111","PHI101","PHI104","LBA101","LBA102",
				"POL101","POL104","ECO101","ECO104","ENV203","GEO205","ANT101","BIO103","MAT116",
				"MAT120","MAT125","MAT130","MAT250","MAT350","MAT361","PHY107+L","PHY108+L",
				"CHE101+L","EEE452","CEE110","BEN205","CSE115+L","CSE215+L","CSE173","CSE225+L",
				"CSE231+L","CSE299","CSE311+L","CSE323","CSE327","CSE331+L","CSE332","CSE373",
				"CSE425","CSE498","CSE499A","CSE499B","CSE417","CSE401","CSE418","CSE426",
				"CSE473","CSE491","CSE411","CSE424","CSE427","CSE428","CSE429","CSE492",
				"CSE422","CSE438","CSE482","CSE485","CSE486","CSE493","CSE433","CSE435",
				"CSE413","CSE414","CSE494","CSE419","CSE440","CSE445","CSE465","CSE467",
				"CSE468","CSE470","CSE495","CSE446","CSE447","CSE448","CSE449","CSE496");
		
		
		com2.getItems().addAll("ENG102","ENG103","ENG111","PHI101","PHI104","LBA101","LBA102",
				"POL101","POL104","ECO101","ECO104","ENV203","GEO205","ANT101","BIO103","MAT116",
				"MAT120","MAT125","MAT130","MAT250","MAT350","MAT361","PHY107+L","PHY108+L",
				"CHE101+L","EEE452","CEE110","BEN205","CSE115+L","CSE215+L","CSE173","CSE225+L","CSE231+L",
				"CSE299","CSE311+L","CSE323","CSE327","CSE331+L","CSE332","CSE373",
				"CSE425","CSE498","CSE499A","CSE499B","CSE417","CSE401","CSE418","CSE426",
				"CSE473","CSE491","CSE411","CSE424","CSE427","CSE428","CSE429","CSE492",
				"CSE422","CSE438","CSE482","CSE485","CSE486","CSE493","CSE433","CSE435",
				"CSE413","CSE414","CSE494","CSE419","CSE440","CSE445","CSE465","CSE467",
				"CSE468","CSE470","CSE495","CSE446","CSE447","CSE448","CSE449","CSE496");
		
		com3.getItems().addAll("ENG102","ENG103","ENG111","PHI101","PHI104","LBA101","LBA102",
				"POL101","POL104","ECO101","ECO104","ENV203","GEO205","ANT101","BIO103","MAT116",
				"MAT120","MAT125","MAT130","MAT250","MAT350","MAT361","PHY107+L","PHY108+L",
				"CHE101+L","EEE452","CEE110","BEN205","CSE115+L","CSE215+L","CSE173","CSE225+L","CSE231+L",
				"CSE299","CSE311+L","CSE323","CSE327","CSE331+L","CSE332","CSE373",
				"CSE425","CSE498","CSE499A","CSE499B","CSE417","CSE401","CSE418","CSE426",
				"CSE473","CSE491","CSE411","CSE424","CSE427","CSE428","CSE429","CSE492",
				"CSE422","CSE438","CSE482","CSE485","CSE486","CSE493","CSE433","CSE435",
				"CSE413","CSE414","CSE494","CSE419","CSE440","CSE445","CSE465","CSE467",
				"CSE468","CSE470","CSE495","CSE446","CSE447","CSE448","CSE449","CSE496");
		com4.getItems().addAll("ENG102","ENG103","ENG111","PHI101","PHI104","LBA101","LBA102",
				"POL101","POL104","ECO101","ECO104","ENV203","GEO205","ANT101","BIO103","MAT116",
				"MAT120","MAT125","MAT130","MAT250","MAT350","MAT361","PHY107+L","PHY108+L",
				"CHE101+L","EEE452","CEE110","BEN205","CSE115+L","CSE215+L","CSE173","CSE225+L","CSE231+L",
				"CSE299","CSE311+L","CSE323","CSE327","CSE331+L","CSE332","CSE373",
				"CSE425","CSE498","CSE499A","CSE499B","CSE417","CSE401","CSE418","CSE426",
				"CSE473","CSE491","CSE411","CSE424","CSE427","CSE428","CSE429","CSE492",
				"CSE422","CSE438","CSE482","CSE485","CSE486","CSE493","CSE433","CSE435",
				"CSE413","CSE414","CSE494","CSE419","CSE440","CSE445","CSE465","CSE467",
				"CSE468","CSE470","CSE495","CSE446","CSE447","CSE448","CSE449","CSE496");
		com5.getItems().addAll("ENG102","ENG103","ENG111","PHI101","PHI104","LBA101","LBA102",
				"POL101","POL104","ECO101","ECO104","ENV203","GEO205","ANT101","BIO103","MAT116",
				"MAT120","MAT125","MAT130","MAT250","MAT350","MAT361","PHY107+L","PHY108+L",
				"CHE101+L","EEE452","CEE110","BEN205","CSE115+L","CSE215+L","CSE173","CSE225+L","CSE231+L",
				"CSE299","CSE311+L","CSE323","CSE327","CSE331+L","CSE332","CSE373",
				"CSE425","CSE498","CSE499A","CSE499B","CSE417","CSE401","CSE418","CSE426",
				"CSE473","CSE491","CSE411","CSE424","CSE427","CSE428","CSE429","CSE492",
				"CSE422","CSE438","CSE482","CSE485","CSE486","CSE493","CSE433","CSE435",
				"CSE413","CSE414","CSE494","CSE419","CSE440","CSE445","CSE465","CSE467",
				"CSE468","CSE470","CSE495","CSE446","CSE447","CSE448","CSE449","CSE496");
		
		com1.setPromptText("Select Course");
		com2.setPromptText("Select Course");
		com3.setPromptText("Select Course");
		com4.setPromptText("Select Course");
		com5.setPromptText("Select Course");
		
		
		com1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
				val1=com1.getValue();
			
		}
		});
		
		com2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				val2=com2.getValue();
					
		}
		});
		
		com3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				val3=com3.getValue();
				
		}
		});
		
		com4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
					
					val4=com4.getValue();
					
			}
			});
		
		com5 .setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				val5=com5.getValue();
					
		}
		});
		
		ComboBox<String> comc1=new ComboBox<>();
		ComboBox<String> comc2=new ComboBox<>();
		ComboBox<String> comc3=new ComboBox<>();
		ComboBox<String> comc4=new ComboBox<>();
		ComboBox<String> comc5=new ComboBox<>();
		
		comc1.getItems().addAll("0","1","2","3","4");
		comc2.getItems().addAll("0","1","2","3","4");
		comc3.getItems().addAll("0","1","2","3","4");
		comc4.getItems().addAll("0","1","2","3","4");
		comc5.getItems().addAll("0","1","2","3","4");
		
		comc1.setPromptText("Select Course Credit");
		comc2.setPromptText("Select Course Credit");
		comc3.setPromptText("Select Course Credit");
		comc4.setPromptText("Select Course Credit");
		comc5.setPromptText("Select Course Credit");
		
		comc1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
				valc1=comc1.getValue();
			
		}
		});
			
		comc2.setOnAction(new EventHandler<ActionEvent>() {
			
		@Override
		public void handle(ActionEvent event) {
					
				valc2=comc2.getValue();
					
		}
		});
			
		comc3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
						
				valc3=comc3.getValue();
					
		}
		});
			
		comc4.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				valc4=comc4.getValue();
						
		}
		});
			
		comc5 .setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				valc5=comc5.getValue();
					
		}
		});
		

		ComboBox<String> comg1=new ComboBox<>();
		ComboBox<String> comg2=new ComboBox<>();
		ComboBox<String> comg3=new ComboBox<>();
		ComboBox<String> comg4=new ComboBox<>();
		ComboBox<String> comg5=new ComboBox<>();
		
		comg1.getItems().addAll("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		comg2.getItems().addAll("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		comg3.getItems().addAll("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		comg4.getItems().addAll("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		comg5.getItems().addAll("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F");
		
		comg1.setPromptText("Select Grade");
		comg2.setPromptText("Select Grade");
		comg3.setPromptText("Select Grade");
		comg4.setPromptText("Select Grade");
		comg5.setPromptText("Select Grade");
		
		comg1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
				valg1=comg1.getValue();
				switch(valg1) {
				case "A+":
				case "A":
					cg1=4.0;
					break;
				case "A-":
					cg1=3.7;
					break;
				case "B+":
					cg1=3.3;
					break;
				case "B":
					cg1=3.0;
					break;
				case "B-":
					cg1=2.7;
					break;
				case "C+":
					cg1=2.3;
					break;
				case "C":
					cg1=2.0;
					break;
				case "C-":
					cg1=1.7;
					break;
				case "D+":
					cg1=1.3;
					break;
				case "D":
					cg1=1.0;
					break;
				case "F":
					cg1=0.0;
					break;
				default:
					cg1=0;
					break;
				}
			
		}
		});
			
		comg2.setOnAction(new EventHandler<ActionEvent>() {
			
		@Override
		public void handle(ActionEvent event) {
					
				valg2=comg2.getValue();
				switch(valg2) {
				case "A+":
				case "A":
					cg2=4.0;
					break;
				case "A-":
					cg2=3.7;
					break;
				case "B+":
					cg2=3.3;
					break;
				case "B":
					cg2=3.0;
					break;
				case "B-":
					cg2=2.7;
					break;
				case "C+":
					cg2=2.3;
					break;
				case "C":
					cg2=2.0;
					break;
				case "C-":
					cg2=1.7;
					break;
				case "D+":
					cg2=1.3;
					break;
				case "D":
					cg2=1.0;
					break;
				case "F":
					cg2=0.0;
					break;
				default:
					cg2=0;
					break;
				}
					
		}
		});
			
		comg3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
						
				valg3=comg3.getValue();
				
				switch(valg3) {
				case "A+":
				case "A":
					cg3=4.0;
					break;
				case "A-":
					cg3=3.7;
					break;
				case "B+":
					cg3=3.3;
					break;
				case "B":
					cg3=3.0;
					break;
				case "B-":
					cg3=2.7;
					break;
				case "C+":
					cg3=2.3;
					break;
				case "C":
					cg3=2.0;
					break;
				case "C-":
					cg3=1.7;
					break;
				case "D+":
					cg3=1.3;
					break;
				case "D":
					cg3=1.0;
					break;
				case "F":
					cg3=0.0;
					break;
				default:
					cg3=0;
					break;
				}
					
		}
		});
			
		comg4.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				valg4=comg4.getValue();
				
				switch(valg4) {
				case "A+":
				case "A":
					cg4=4.0;
					break;
				case "A-":
					cg4=3.7;
					break;
				case "B+":
					cg4=3.3;
					break;
				case "B":
					cg4=3.0;
					break;
				case "B-":
					cg4=2.7;
					break;
				case "C+":
					cg4=2.3;
					break;
				case "C":
					cg4=2.0;
					break;
				case "C-":
					cg4=1.7;
					break;
				case "D+":
					cg4=1.3;
					break;
				case "D":
					cg4=1.0;
					break;
				case "F":
					cg4=0.0;
					break;
				default:
					cg4=0;
					break;
				}
						
		}
		});
			
		comg5 .setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
					
				valg5=comg5.getValue();
				
				switch(valg5) {
				case "A+":
				case "A":
					cg5=4.0;
					break;
				case "A-":
					cg5=3.7;
					break;
				case "B+":
					cg5=3.3;
					break;
				case "B":
					cg5=3.0;
					break;
				case "B-":
					cg5=2.7;
					break;
				case "C+":
					cg5=2.3;
					break;
				case "C":
					cg5=2.0;
					break;
				case "C-":
					cg5=1.7;
					break;
				case "D+":
					cg5=1.3;
					break;
				case "D":
					cg5=1.0;
					break;
				case "F":
					cg5=0.0;
					break;
				default:
					cg5=0;
					break;
				}
					
		}
		});
		
		
		
		
	calculate.setOnAction(new EventHandler<ActionEvent>() {
		
	@Override
	public void handle(ActionEvent event) {
		
		int credit1=Integer.parseInt(valc1);
		int credit2=Integer.parseInt(valc2);
		int credit3=Integer.parseInt(valc3);
		int credit4=Integer.parseInt(valc4);
		int credit5=Integer.parseInt(valc5);
		
		double cgpa=(cg1*credit1+cg2*credit2+cg3*credit3+cg4*credit4+cg5*credit5)/(credit1+credit2+credit3+credit4+credit5);
	
		String name=tfn.getText().toString();
		String id=tfi.getText().toString();
		
		File obj=new File("StudentInfo.txt");
		try {
			obj.createNewFile();
		}catch (IOException e) {
				e.printStackTrace();
		}
		
		try {
			FileWriter fw=new FileWriter("StudentInfo.txt");
			fw.write("Student Name: "+name+"\n"+"Student ID: "+id+"\n"+
			"Course1: "+val1+"\n"+"Course2: "+val2+"\n"+"Course3: "+val3+"\n"+"Course4: "+val4+"\n"+"Course5: "+val5+"\n"+
			"Course1 Credit: "+valc1+"\n"+"Course2 Credit: "+valc2+"\n"+"Course3 Credit: "+valc3+"\n"+"Course4 Credit: "+valc4+"\n"+"Course5 Credit: "+valc5+"\n"+
			"Course1 Grade: "+valg1+"\n"+"Course2 Grade: "+valg2+"\n"+"Course3 Grade: "+valg3+"\n"+"Course4 Grade: "+valg4+"\n"+"Course5 Grade: "+valg5+"\n"
			+"Total CGPA: "+cgpa);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader fr;
			
		String[] val=new String[20] ;
		try {
			fr = new FileReader("StudentInfo.txt");
			Scanner sc=new Scanner(fr);
			int count=0;
			while(sc.hasNextLine()) {
				val[count]=sc.nextLine();			
				count++;	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Label lbu=new Label("---NORTH SOUTH UNIVERSITY---");	
		Label lbv0=new Label(val[0]);	
		Label lbv1=new Label(val[1]);
		Label lbv2=new Label(val[2]);
		Label lbv3=new Label(val[3]);
		Label lbv4=new Label(val[4]);
		Label lbv5=new Label(val[5]);
		Label lbv6=new Label(val[6]);
		Label lbv7=new Label(val[7]);
		Label lbv8=new Label(val[8]);
		Label lbv9=new Label(val[9]);
		Label lbv10=new Label(val[10]);
		Label lbv11=new Label(val[11]);
		Label lbv12=new Label(val[12]);
		Label lbv13=new Label(val[13]);
		Label lbv14=new Label(val[14]);
		Label lbv15=new Label(val[15]);
		Label lbv16=new Label(val[16]);
		Label lbv17=new Label(val[17]);
		Label lbv18=new Label(val[18]);	
			
		HBox hbu=new HBox(10,lbu);
		HBox hb1=new HBox(10,lbv0,lbv1);
		HBox hb2=new HBox(10,lbv2,lbv3,lbv4,lbv5,lbv6);
		HBox hb3=new HBox(10,lbv7,lbv8,lbv9,lbv10,lbv11);
		HBox hb4=new HBox(10,lbv12,lbv13,lbv14,lbv15,lbv16);
		HBox hb5=new HBox(10,lbv17);
		
		
		hbu.setAlignment(Pos.CENTER);
		hb1.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);
		hb3.setAlignment(Pos.CENTER);
		hb4.setAlignment(Pos.CENTER);
		hb5.setAlignment(Pos.CENTER);
		
		VBox vb=new VBox(20,hbu,hb1,hb2,hb3,hb4,hb5);
		vb.setAlignment(Pos.CENTER);
		
		Scene sc=new Scene(vb,800,500);

		primaryStage.setTitle("CGPA");
		primaryStage.setScene(sc);
		primaryStage.show();	
						
	}
	
	});
		
	HBox hb0=new HBox(lb0);
	hb0.setAlignment(Pos.CENTER);
	
		HBox hb=new HBox(lb);
		hb.setAlignment(Pos.CENTER);
		
		HBox hb1=new HBox(20,lbn,tfn,lbi,tfi);
		HBox hb21=new HBox(10,clb);
		HBox hb22=new HBox(130,cdlb,glb);
		HBox hb2=new HBox(50,hb21,hb22);
		HBox hb3=new HBox(20,clb1,com1,comc1,comg1);
		HBox hb4=new HBox(20,clb2,com2,comc2,comg2);
		HBox hb5=new HBox(20,clb3,com3,comc3,comg3);
		HBox hb6=new HBox(20,clb4,com4,comc4,comg4);
		HBox hb7=new HBox(20,clb5,com5,comc5,comg5);
		
		hb1.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);
		hb3.setAlignment(Pos.CENTER);
		hb4.setAlignment(Pos.CENTER);
		hb5.setAlignment(Pos.CENTER);
		hb6.setAlignment(Pos.CENTER);
		hb7.setAlignment(Pos.CENTER);
		
		VBox vb1=new VBox(10,hb1,hb2,hb3,hb4,hb5,hb6,hb7);
		VBox vb=new VBox(30,hb,hb0,vb1,calculate);
		
		vb1.setAlignment(Pos.CENTER);
		vb.setAlignment(Pos.CENTER);
		

		Scene sc=new Scene(vb,600,400);
		
		primaryStage.setTitle("#####_____|||||---CGPA CALCULATOR---|||||_____#####");
		primaryStage.setScene(sc);
		primaryStage.show();
	
}
	
	public static void main(String[] args) {
		launch(args);
	}
}
