/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public class RobotMap {
  // You can program two diffrent motors to work 
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //private static final int _0 = 0;
  // PWN


  // DIO

  // CAN
  public static int leftMasterPort = 1; //4; 
  public static int leftSlavePort = 2; //2
  public static int rightMasterPort = 3; //1
  public static int rightSlavePort = 4; //3
  //those up there are for the main motors moving the robot so dont do anything to the code

  //THESE ARE FOT THE ONES ONTOP OF THE ROBOT
  //public static int elevatorPort = 5; //motor controller for the elevator; UPDOG (this bitch is dead)
  public static int intakePort = 5; //motor controller for the intake; Snirby
  public static int elevatorPort = 6; //new motor for the elevator; Killer Queen
  public static int spam1Port = 7; //motor controller 1 for the cannon; PK Fire
  public static int spam2Port = 8; //motr controller 2 for teh cannon; Sex Pistols
  public static int colorPort = 9; //motor controller for the color wheel; (IM TRUSTING YOU TO GIVE IT A GOOD NAME); Over The Rainbow

  // USB 1 (GameCube Controller)
  public static int joystickPort = 0;
  
  // Controller Buttons 
  // these are basically the inputs for all of the buttons. inputs will definitly be diffrent for other controllers.
  public static int ybutton = 1;
  public static int bbutton = 2;
  public static int abutton = 3;
  public static int xbutton = 4;
  public static int L1 = 5;
  public static int R1 = 6;
  public static int ZL1 = 7;
  public static int ZR1 = 8;
  public static int minus = 9;
  public static int plus = 10;
  public static int clickleft = 11;
  public static int clickright = 12;
  public static int screenshot = 13;
  public static int home = 14;
  
  //USB 2 (PS4 Controller)
  //public static int joystickport = 1;

  //USB 3 (NES Power Glove)
  //public static int joystickport = 2;


  //public static int 

  //Controller Buttons
  


  // Other Drivetrain Constants
  // turns out that these didnt really matter since we are using the camera.
  // im sure it would matter if we used the other wheels
}
