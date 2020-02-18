/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;
import frc.robot.commands.AutoTurn;
import frc.robot.commands.MoveForward;
/**
 * An example command.  You can replace me with your own command.
 */
public class MoveToBall extends SequentialCommandGroup {
  private static double pyangle = 1;
  private static double rangeDistance = Robot.rangeFinder.getDistance();

  public MoveToBall(AutoTurn AutoTurn, MoveForward MoveForward){
    new AutoTurn(pyangle);
    new MoveForward(rangeDistance, 1);
 
  }
 

}