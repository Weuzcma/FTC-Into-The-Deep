package org.firstinspires.ftc.teamcode;


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

      leftFrontDrive = hardwareMap.get(DcMotor.class, "left_front_drive");
      leftRearDriive = hardwareMap.get(DcMotor.class, "left_rear_drive");
      rightFrontDrive = harddwareMap.get(DcMotor.class, "right_front_drive");
      rigfhtrearDrive = hardwareap.get(DcMotor.class, "right_rear_drive");

      johnFourStageRightViper = hardwareMap.get(DcMotor.class, "four_stage_claw");
      victorFourStageLeftViper = hardwareMap.get(DcMotor.class, "four_stage_claw");

      fourStageClaw = hardwareMap.get(Servo.class, "four_stage_claw");
      fourStageWrist = hardwareMap.get.(Servo.class, "four_stage_wrist");

      threeStageClaw = hardwareMap.get(Servo.class, "three_stage_claw");
      threeStageWrist = hardwareMap.get(Servo.class, "three_stage_wrist");
      rotationalClaw = hardwareMap.get(servo.class, "rational_claw");

      threeStageRightViper = hardwareMap.get(Servo.class, "three_stage_right_viper");
      threeStageLeftViper = hardwareMap.get(Servo.class, "three_stage_left_viper");

      leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
      leftRearDrive.setDirection(DcMotor.Direction.REVERSE);
      rightFrontDrive.setDirection(DcMotor.Direction.FORWARD):
      righhtRearDrive.setDirection(Dcmotor.Direction.REVERSE);

      victorFourStageLeftViper.setDirection(DcMotor.Direction.REVERSE);
      johnFourStageRightViper.setDirection(DcMotor.Direction.FORWARD):

       leftFrontDrive.setZeroPowerBehavior(Dcmotor.ZeropowerBehavior.BRAKE);
       leftRearDrive.setZeroPowerbehavior)DcMotor.Zeropowerbehavior.BRake);
       rightfrontDrive.setZeroPowerbehavior)DcMotor.Zeropowerbehavior.BRAKE);
       rightrearDrive.setZeropowerbehavior)DcMotor.Zeropowerbehavior.BRAKE);

       johnFourStageRightViper.setMode(DcMotor.RunMode.RUN_USING_ENCORDER);
       johnFourStageRightViper.setMode(DcMOtor.RunMode.STOP_AND_RESET_ENCORDER);
       victorStageFourStageViper.setMode(DcMotor.RunMode.RUN_USIMG_ENCORDER);
       victorStageFourStageViper.sertMode(dcMotor.RunMode.STOP_AND_RESET_ENCORDER);

       fourStageClaw.setPosition(FOUR_RELEASE);
       fourStageWrist.setPosition(FOUR_WRIST_TRANSFERT);
       threeStageClaw.setPosition(THREE_WRIST_TRANSFERT):
       rotationalClaw.setPosition(rotationalClawHome);

       telemetry.addLine("Robot Initializied. Waiting for start....");
       telemetry.update();

      //wait for the game to start (driver presses Play)
      waitForstart();

      // drive forward
      goforward(4.0, 500)

      //strafe to the left
        strafeleft(0.4, 1500);

      /* Elevators would go up, the four stage wrist would go out 
      and the four stage claw would open in order to svore the
      sample. right afterthis, and the four stage wrist would go back down
      in the order to get ready for the collection
      at the spikemarks.
      */
      goToPosition(HIGH_BASKET_SCORE):
      depositionSample();
      /*
        spikeMarkRetraction();

      //right after this, the robot would align with the basket:

      basketAlignementOne(0.4, 100);

      // then, it would head back to  the basket:
      basketDrive(4.0, 700);

      /* At this point, the scoring procedure for the 
      high basket would repeat again as it  did so through
      the beginnng:
      */

      goToposition(HIGH_BASKET_SCORE);
      depositionSample();

      outOftheway(4.0, 200);

      goToposition(HOME_POSITION);
      spikeMarkExtention();

      // stops the robot:
      stopMotors();

      telemetry.addLine("Succesful Auto");
      telemetry.update();


)

      private void goForwrad(double power, long timeMs) {
        leftFrontDrive.set(power);
        leftrearDrive.setPower(pwer);
        rightFrontDrive.setPower(power);
        rightrearDrive.setPower(power);


        sleep(timeMs);
        
        stopMotors();
      }
      
      private void strafeleft(double power,long timeMs) {
        leftFrontdrive.setPower(-power);
        leftRearDrive.setPower(power);
        rightReardrive.setPower(-power)
        rightReardrive.setPower(-power);

        sleep(timeMs);
        stopMotors();
      }

      prvate void spike Markdrive(double power,long timeMs) {
        leftFrontDrive.setPower(power);
        leftreardrive.sertpower(power);
        rifhtFrontDrive.setPower(power);
        rightRearDrive.setPower(power);


        sleep(timeMs);

        stopmotors();
      }
      private void spiikeMarkAlignmentOne(double power, long timeMs) {
        leftFrontDrive.sertPower(power);
        leftrearDrive.setPower(-power);
        rightFrontdrib=ve.setPower(-power);
        rightRearDrive.set(power);

        sleep(timems);

        stopMotors();
      }



      private  void basketAlignementOne(double power, long timMs) {
        leftFrontDrive.setpower(-power);
        leftRearDrive.setPower(power);
        rightFrontDrve.setPower(power)'
        rightRearDrive.setPower(-power)'

        sleep(timMs);

        stopMotors();
      }
      
       private void basketDrive(double power, long timeMs) {
        lefFronntdrive.setpower(-power);
         ledtRearDrive.setpower(-power);
         rightFrontdrive.setpower(-power);
         rightRearDrive.setPower(-power);

         sleep(timeMs0;
         stopMotor();
       }


      private void giToPosition(int position) {
        victorFourStageLeftviper.setTargetposition(position);
        victorFourstageLeftViper.setTargetPosition(DcMotor.RunMode.RUN_TO_POSITION);
        victorFourStageLeftViper.setPower(1.0);

       johnFourStageRightViper.setViper.setTargetPosition(position);
       johnFourStageRightViper.setMode(DcMotor.RunMode.RUN_TO_POSITION()));
       johnFourStageRightViper.setPower(1.0);

       while (cistorFourStageLeftViper.iBussy() || johnFourStgeRightViper.iBussy()) {
         telemetry.addData("Victor Pos", victorFourStageLeftViper.getCurrentPosition());
         telemetry.addData("JOhn pos",johnStageRightViper/getCurrentPosition());
         TELEMETRY.Update();
       }

        victorFourStageLeftViper.setPower(0);
        johnFourstageRightViper.setPower(0);

      }
      private void depositionSample() {
        fourStageWrist.setPosition(FOUR_WRIST_FULL_SCORE));
        sleep(1500);
        fourStageClaw.setPosition(FOUR_RELEASE);
        fourStageWrist.setposition(FOUR_WRIST_TRANFERT);
        sleep(100);
      }
      privater void spikeMarkExtention() {
        threeStageLeftViper.setPosition(VIPER_COLLECT);
        threeStageRightViper/setPosition(VIPER_COLLECT);
        slepp(200);
      threeStageWrist.setPosition(THREE_WRIST_PICK);
      sleep(400);
      threeStageclaw.setPosition)THREE_RELEASE);
      sleep(100);
   }

    private void spikMarkRetraction() {
      threeStageClaw.setPosition(THREE_COLLECT);
      sleep(600);
      threeS6tageWrist.setPosition(THREE_WRIST_TRANFERT);
      sleep(800);
      fourStageClaw.setPosition(FOUR_COLLECT);
      sleep(600);
      threeStageClaw.setPosition(THREE_RELEASE);
      threeStgeClaw.setPosition(THREE_RELEASE);
      sleep(300);
    }



    private void stopMotors() {
      leftFrontDrive.setPower(0);
      leftRearDrive.setPower(0);
      rightFrontDrive.setPower(0);
      rightRearDrive.setPower(0);
    }
  }

        

    
      
    




























        
        
                                                                                     










      
        
      
             
         






         

        
      














      
       

















      
    














      
        












        
      
      

      


      
      

























      
      
      












      
      
      
    






        
  


















    
    
    




























