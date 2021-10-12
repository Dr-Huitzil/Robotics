/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.ElevatorCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShootingCommand;
import frc.robot.commands.WheelOfFortuneCommand;

public class OI {
  /** CREATING BUTTONS
  One type of button is a joystick button which is any button on a joystick.
  You create one by telling it which joystick it's on and which button number it is.
  */

  public Joystick stick = new Joystick(RobotMap.joystickPort);

  public JoystickButton SnirbyButtonSucc = new JoystickButton(stick, RobotMap.ZL1); //intake
  public JoystickButton PKFireButtonSpam = new JoystickButton(stick, RobotMap.ZR1); //shoot
  public JoystickButton SexPistolsButtonFire = new JoystickButton(stick, RobotMap.ZR1); //shoot
  public JoystickButton KillerButtonStairway2Heaven = new JoystickButton(stick, RobotMap.L1); //up
  public JoystickButton KillerButtonHighway2Hell = new JoystickButton(stick, RobotMap.R1); //down
  public JoystickButton OverTheRainbowButtonSpin = new JoystickButton(stick, RobotMap.ybutton); //spin 3<x>5
  public JoystickButton OverTheRainbowButtonGoldenRectangle = new JoystickButton(stick, RobotMap.xbutton); //spin to specific color
  

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

    PKFireButtonSpam.whenPressed(new ShootingCommand(0.9));
    PKFireButtonSpam.whenReleased(new ShootingCommand(0.0));
    SexPistolsButtonFire.whenPressed(new ShootingCommand(-0.9));
    SexPistolsButtonFire.whenReleased(new ShootingCommand(0.0));

    KillerButtonStairway2Heaven.whenPressed(new ElevatorCommand(0.7));
    KillerButtonStairway2Heaven.whenReleased(new ElevatorCommand(0.0));
    KillerButtonHighway2Hell.whenPressed(new ElevatorCommand(-0.7));
    KillerButtonHighway2Hell.whenReleased(new ElevatorCommand(0.0));

    OverTheRainbowButtonSpin.whenPressed(new WheelOfFortuneCommand(1.0));
    OverTheRainbowButtonSpin.whenReleased(new WheelOfFortuneCommand(0.0));
    OverTheRainbowButtonGoldenRectangle.whenPressed(new WheelOfFortuneCommand(1.0));
    OverTheRainbowButtonGoldenRectangle.whenReleased(new WheelOfFortuneCommand(0.0));

    }

}
