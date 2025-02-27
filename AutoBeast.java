packege org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.evenloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcom.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "autobeast", group = "FTC")
  public class Autobeast extends LinearOpMode {

// we're declaring all of the drivetrain mototrs

private Dcmotor leftFrontDrive = null;
private Dcmotor leftrearDrive = null;
private Dcmotor rightfrontDrive= null;
private Dcmotor rightrearDrve = null;
    
// here,we declare the two four stage viper motors:

private Dcmotor johnFourStageRightViper = null;
private Dcmotor victorFourStageLeftViper = null;

// here we declare all of the four stage viper components:

private Servo fourStageClaw = null;
private Servo fourStageWrist = null;

//here, we declare all of the Three Stage Viper Compoments:

private servo threeStageRightViper = null;
private servo threeStageLeftViper = null;

//here, we declare the int psition for positions for the two four Stage Vipers:

final int HIGH_BASKET_SCORE = 3000;
final int HIGH_CHAMBER_POSITION = 2000;
final int HIGH_CHAMBER_SCORE = 1300;
final int HOME_POSITION = 10;
    
// here we declaring the double positions for the four Stage Servos:

final double FOUR_COOLECT = 0.98;
final double FOUR_RELEASE = 0.8;

final double FOUR_WRIST = 0.15;
final double FOUR_WRIST_FULL_SCORE = 0.77;

//here we declere the double positions for the three Stage Servo:

final double THREE_WRIST_TRANSFERT = 0.99;
    final double THREE_WRIST_PICK = 0.129;
    final double THREE_COLLET = 0.64;
    final double THREE_RELEASE = 0.0;
    final double VIPER_COLLECT = 0.20;
    final double VIPER_TRANSFERT = .578;

    // declering the positions/modes positions for the rotational claw:

    final double rotationClawIncrement =0.02;
    final double rotationClawHome = 0.2;

    /* here we declering the references for each of the int double
    positions for both the Four stage Vipers as the rotational
    claws
    */
    
    double rotationClawposition = rotationClawHome;

    int victorPostion = HOME_POSITION;
    int johnPosition = HOME_POSITION;

    @Override
    public void run OpMode() {

      leftFrontDrive = gerdwareMap.get(DcMotor.class, "left_front_drive");
      leftRear






        
  


















    
    
    




























