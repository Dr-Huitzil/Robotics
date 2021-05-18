/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
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
  public static int elevatorPort = 5; //motor controller for the elevator; UPDOG
  public static int intakePort = 6; //motor controller for the scoop; Snirby
  public static int somethingPort = 7; //motor in the middle of the thing; Killer Queen
  

  // USB
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
  


  // Other Drivetrain Constants
  // turns out that these didnt really matter since we are using the camera.
  // im sure it would matter if we used the other wheels
  //public static int wheelDiameter = 7;
}
