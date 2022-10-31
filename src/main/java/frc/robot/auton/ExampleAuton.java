package frc.robot.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.chassis.Chassis;
import frc.robot.chassis.ForwardFor;
import frc.robot.chassis.TurnFor;
// cleverly imports the one instance of the chassis
import static frc.robot.RobotContainer.chassis;

public class ExampleAuton extends SequentialCommandGroup {

   // order of operations represented by many, many variables
   private final double forward1 = .3;
   private final double time1 = 1.2;

   private final double turnSpeed2 = .3;
   private final double time2 = .5;

   private final double forward3 = .3;
   private final double time3 = .6;

   public ExampleAuton() {
      // adds chassis to requirements 
      addRequirements(chassis);
      // adds the commands in the auton
      addCommands(
         new ForwardFor(forward1, time1),
         new TurnFor(turnSpeed2, time2),
         new ForwardFor(forward3, time3)
      );

   }
   
}
