// Two notes here:
//   1. You must rename this and put in your username
//   2. You must comment out this line to compile with "javac"
package edu.saintjoe.cs.jsmith2.smitevgs;

/* App Skeleton
 * Written by Brian Capouch 17 March 2015
 * This app will serve as the basis for student project apps
 */
// App Skeleton
// Forked from Capouch added to by Jared Smith
// 3/18/2016
// For class
// Import directives tell Eclipse which components you intend to use
import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Form;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;

import com.google.devtools.simple.runtime.events.EventDispatcher;

// This is the only class file for our app
public class SmiteVGSActivity extends Form implements HandlesEventDispatching {

	
	// We begin with constants, and "global settings" variables
	// -- This app has none for now
	
	// Next are the UI widget references
	
	// These objects are equivalent to "components" of App Inventor
	// The containers which organize the app screen
	private HorizontalArrangement line1;
	private HorizontalArrangement line2;
	private HorizontalArrangement line3;
	private HorizontalArrangement line4;
	private HorizontalArrangement line5;
	private HorizontalArrangement line6;
	private HorizontalArrangement line7;
	private HorizontalArrangement line8;
	private HorizontalArrangement line9;
	private HorizontalArrangement line10;
	private HorizontalArrangement line11;
	private HorizontalArrangement line12;
	private HorizontalArrangement line13;
	private HorizontalArrangement line14;
	
	// Next our two components
	private Button Button1;
	private Button Button2;
	private Button Button3;
	private Button Button4;
	private Button Button5;
	private Button Button6;
	private Button Button7;
	private Button Button8;
	private Button Button9;
	private Button Button10;
	private Button Button11;
	private Button Button12;
	private Button Button13;
	private Button Button14;
	private Label resultLabel;

 // Java Bridger apps all use $define() in place of main()
 void $define() {
 	
 	// Code in this block is equivalent to the "Designer" part of App Inventor
    
	 // "this" is an Activity object, or the "main screen"
     this.BackgroundColor(COLOR_WHITE);
     
     // Create containers for UI widgets
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);
     line4 = new HorizontalArrangement(this);
     line5 = new HorizontalArrangement(this);
     line6 = new HorizontalArrangement(this);
     line7 = new HorizontalArrangement(this);
     line8 = new HorizontalArrangement(this);
     line9 = new HorizontalArrangement(this);
     line10 = new HorizontalArrangement(this);
     line11 = new HorizontalArrangement(this);
     line12 = new HorizontalArrangement(this);
     line13 = new HorizontalArrangement(this);
     line14 = new HorizontalArrangement(this);
     
     // Now create the user interface
     Button1 = new Button(line1,"");
     Button2 = new Button(line2,"");
     Button3 = new Button(line3,"");
     Button4 = new Button(line4,"");
     Button5 = new Button(line5,"");
     Button6 = new Button(line6,"");
     Button7 = new Button(line7,"");
     Button8 = new Button(line8,"");
     Button9 = new Button(line9,"");
     Button10 = new Button(line10,"");
     Button11 = new Button(line11,"");
     Button12 = new Button(line12,"");
     Button13 = new Button(line13,"");
     Button14 = new Button(line14,"");
     resultLabel = new Label(line3,"");
     
     // Let the runtime system know which events to report to the dispatcher
     EventDispatcher.registerEventForDelegation(this, "ButtonClick", "Click");
    
 } // end $define()

 // This method, known as a "callback" is invoked by the runtime system
 // It will only be called when a delegated event occurs
 @Override
 public boolean dispatchEvent(Component component, String id, String eventName,
         Object[] args) {
 	
 	// This code is equivalent to the "Blocks" part of App Inventor
	    if (component.equals(Button1) && eventName.equals("Click")) {
	        return true;
	     } // end dispatch '+' press
	    
	// This line is syntactically required
    return true;
	} // end dispatchEvent


} // end activity class
