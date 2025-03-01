package frc.org.elevator;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;

public class ElevatorTeleOp extends TimedRobot {
 private Elevator elevator;
 private XboxController controller; // Xbox controller

 @Override
 public void robotInit() {
 SpeedController motor = new PWMVictorSPX(0); // PWM port 0
 elevator = new Elevator(motor);
 controller = new XboxController(0); // USB port 0
 }

 @Override
 public void teleopPeriodic() {
 double speedUp = controller.getRawAxis(3); // Right trigger to go up
 double speedDown = controller.getRawAxis(2); // Left trigger to go down

 if (speedUp > 0.1) {
 elevator.goUp(speedUp);
 } else if (speedDown > 0.1) {
 elevator.goDown(speedDown);
 } else {
 elevator.stop();
 }
 }
}
