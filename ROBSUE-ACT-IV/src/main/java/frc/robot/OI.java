/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.LeftElevatorCommand;
import frc.robot.commands.RightElevatorCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShootingCommand;
//import frc.robot.subsystems.ElevatorSubsystem;

public class OI {
  /** CREATING BUTTONS
  One type of button is a joystick button which is any button on a joystick.
  You create one by telling it which joystick it's on and which button number it is.
  */

  public Joystick stick = new Joystick(RobotMap.joystickPort);

  public JoystickButton SnirbyButtonSucc = new JoystickButton(stick, RobotMap.L1); //intake

  public JoystickButton PKFireButtonSpam = new JoystickButton(stick, RobotMap.R1); //shoot
  public JoystickButton SexPistolsButtonFire = new JoystickButton(stick, RobotMap.R1); //shoot
  public JoystickButton OverTheRainbowButtonSpin = new JoystickButton(stick, RobotMap.R1); //shoot

  public JoystickButton XButton = new JoystickButton(stick, RobotMap.xbutton); //up
  public JoystickButton RBumper = new JoystickButton(stick,RobotMap.ZR1); // Up
  public JoystickButton YButton = new JoystickButton(stick, RobotMap.ybutton); //down
  public JoystickButton LBumper = new JoystickButton(stick, RobotMap.ZL1);
  
  

  public OI() {
    /**
    intake control
    if i remember correctly the decimal point is the speed of the which the motor is going to go.
    so like Snirby will go 70% of the full speed when pressed and releasing it will make it stop
    and when wanting to reverse it, you want the decimal point to be negative so the motor rotates the other direction
    max should be 1.0 and minimum is theoretically 0.0 but im sure 0.00000001 is possible
    */

    SnirbyButtonSucc.whenPressed(new IntakeCommand(0.7));
    SnirbyButtonSucc.whenReleased(new IntakeCommand(0.0));

    //TheGusButton.whenPressed(new ShootingCommand(0.-95))
    //TheGusButton.whenReleased(new ShootingCommand(0.0))
    PKFireButtonSpam.whenPressed(new ShootingCommand(0.95));
    PKFireButtonSpam.whenReleased(new ShootingCommand(0.0));
    SexPistolsButtonFire.whenPressed(new ShootingCommand(0.95));
    SexPistolsButtonFire.whenReleased(new ShootingCommand(0.0));
    OverTheRainbowButtonSpin.whenPressed(new ShootingCommand(0.95));
    OverTheRainbowButtonSpin.whenReleased(new ShootingCommand(0.0));

    XButton.whenPressed(new LeftElevatorCommand(0.9));
    XButton.whenReleased(new LeftElevatorCommand(0.0));
    RBumper.whenPressed(new RightElevatorCommand(0.9));
    RBumper.whenReleased(new RightElevatorCommand(0.0));

    YButton.whenPressed(new LeftElevatorCommand(-0.9));
    YButton.whenReleased(new LeftElevatorCommand(0.0));
    //LBumper.whenPressed(new RightElevatorCommand(-0.9));
    //LBumper.whenReleased(new RightElevatorCommand(0.0));


    }

}