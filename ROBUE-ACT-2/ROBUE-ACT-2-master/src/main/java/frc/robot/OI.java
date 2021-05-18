/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.BallManually;
import frc.robot.commands.LiftManuallyCommand;
import frc.robot.commands.LiftManuallyCommand1;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.


  public Joystick stick = new Joystick(RobotMap.joystickPort);

  public JoystickButton SnirbyButtonfoward = new JoystickButton(stick, RobotMap.abutton);
  public JoystickButton SnirbyButtonReverse = new JoystickButton(stick, RobotMap.bbutton);
  public JoystickButton updogButtonup = new JoystickButton(stick, RobotMap.xbutton);
  public JoystickButton updogButtondown = new JoystickButton(stick, RobotMap.ybutton);
  public JoystickButton KillerButtonrelease = new JoystickButton(stick, RobotMap.L1);
  public JoystickButton KillerButtontakein = new JoystickButton(stick, RobotMap.R1);
  
  public OI(){
    // intake control
    // if i remember correctly the decimal point is the speed of the which the motor is going to go.
    // so like Snirby will go 70% of the full speed when pressed and releasing it will make it stop
    // and when wanting to reverse it, you want the decimal point to be negative so the motor rotates the other direction
    // max should be 1.0 and minimum is theoretically 0.0 but im sure 0.00000001 is possible
    SnirbyButtonfoward.whenPressed(new BallManually(0.7));
    SnirbyButtonfoward.whenReleased(new BallManually(0.0));
  
    SnirbyButtonReverse.whenPressed(new BallManually(-1.0));
    SnirbyButtonReverse.whenReleased(new BallManually(0.0));

    updogButtonup.whenPressed(new LiftManuallyCommand(0.6));
    updogButtonup.whenReleased(new LiftManuallyCommand(0.0));

    updogButtondown.whenPressed(new LiftManuallyCommand(-0.3));
    updogButtondown.whenReleased(new LiftManuallyCommand(0.0));

    KillerButtonrelease.whenPressed(new LiftManuallyCommand1(0.7));
    KillerButtonrelease.whenReleased(new LiftManuallyCommand1(0.0));

    KillerButtontakein.whenPressed(new LiftManuallyCommand1(-0.7));
    KillerButtontakein.whenReleased(new LiftManuallyCommand1(0.0));
  }
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
