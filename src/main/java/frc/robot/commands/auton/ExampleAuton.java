package frc.robot.commands.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Chassis;

import frc.robot.commands.auton.ForwardFor;
import static frc.robot.RobotContainer.chassis;
// cleverly imports the one instance of the chassis
public class ExampleAuton extends SequentialCommandGroup {

   // order of operations represented by many, many variables
   private final double forward1 = .3;
   private final double time1 = 5;

   private final double turnSpeed2 = .3;
   private final double time2 = 3;

   private final double forward3 = .3;
   private final double time3 = 4;

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
