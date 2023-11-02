import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class MainPhysics {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Double F1 = null;
        Double F2 = null;
        Double F3;
        Double F3x = null;
        Double F3y = null;
        Double FR;
        Double tetaFR;
        double tetaFRf = 0;
        String FRr = null;
        Double FRx;
        Double FRy;
        int potenciaDe10 = 0;
        double k = 9e9;
        Scanner s = new Scanner(System.in);
        System.out.println("Hello, welcome. Please enter the option you require. \n 1. Square \n 2.Exit");
        String opcSwitch = s.next();
        switch (opcSwitch) {
            case "1": {
                System.out.println("Enter the value of Q1");
                Integer Q1 = Integer.parseInt(s.next());
                System.out.println("Enter the value of Q2");
                Integer Q2 = Integer.parseInt(s.next());
                System.out.println("Enter the value of Q3");
                Integer Q3 = Integer.parseInt(s.next());
                System.out.println("Enter the value of Q4");
                Integer Q4 = Integer.parseInt(s.next());
                System.out.println("Enter the length of one side");
                Double longitud = Double.parseDouble(s.next());
                //Integer angulo1 = 90;//
                Integer angulo2 = 45;
                System.out.println("Choose the electric charge you will work with \n1.Q1\n2.Q2\n3.Q3\n4.Q4");
                String opcMolecula = s.next();
                switch (opcMolecula) {
                    case "1": {
                        if (Q1 > 0) {
                            if (Q2 > 0) {
                                F1 = k * -(Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                            } else if (Q2 < 0) {
                                F1 = k * (Math.abs(Q2 * Q1) / Math.pow(longitud, 2));
                            }
                            if (Q3 > 0) {
                                F2 = k * (Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            } else if (Q3 < 0) {
                                F2 = k * -(Math.abs(Q3 * Q1) / Math.pow(longitud, 2));
                            }
                            if (Q4 > 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = Math.sin(Math.toRadians(angulo2)) * F3;
                            } else if (Q4 < 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = Math.cos(Math.toRadians(angulo2)) * F3;
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            }
                        } else if (Q1 < 0) {
                            if (Q2 > 0) {
                                F1 = k * (Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                            } else if (Q2 < 0) {
                                F1 = k * -(Math.abs(Q2 * Q1) / Math.pow(longitud, 2));
                            }
                            if (Q3 > 0) {
                                F2 = k * -(Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            } else if (Q3 < 0) {
                                F2 = k * (Math.abs(Q3 * Q1) / Math.pow(longitud, 2));
                            }
                            if (Q4 > 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = Math.cos(Math.toRadians(angulo2)) * F3;
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            } else if (Q4 < 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = Math.cos(Math.toRadians(angulo2)) * -F3;
                                F3y = Math.sin(Math.toRadians(angulo2)) * F3;
                            }
                        }
                        FRx = (F1 + 0 + F3x);
                        FRy = (0 + F2 + F3y);
                        FR = (Math.sqrt((Math.pow(FRx, 2)) + (Math.pow(FRy, 2))));

                        tetaFR = Math.toDegrees(Math.abs(Math.atan(FRy / FRx)));
                        if (FRy > 0 && FRx > 0) {
                            tetaFRf = tetaFR;
                        } else if (FRy < 0 && FRx > 0) {
                            tetaFRf = 270 + tetaFR;
                        } else if (FRy > 0 && FRx < 0) {
                            tetaFRf = 180 - tetaFR;
                        } else if (FRy < 0 && FRx < 0) {
                            tetaFRf = 180 + tetaFR;
                        }
                        System.out.println("The resultant vector is: (" + FRx + "," + FRy + ") \n RV magnitude: " + FR + " RV direction: " + tetaFRf);
                        break;
                    }
                        case "2":{
                            if (Q2 > 0) {
                                if (Q1 > 0) {
                                    F1 = k * (Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                                } else if (Q1 < 0) {
                                    F1 = k * -(Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                                }
                                if (Q3 > 0) {
                                    F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                    F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                    F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                                } else if (Q3 < 0) {
                                    F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                    F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                    F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                                }
                                if (Q4 > 0) {
                                    F2 = k * (Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                                } else if (Q4 < 0) {
                                    F2 = k * -(Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                                }
                            } else if (Q2 < 0) {
                                if (Q1 > 0) {
                                    F1 = k * -(Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                                } else if (Q1 < 0) {
                                    F1 = k * (Math.abs(Q1 * Q2) / Math.pow(longitud, 2));
                                }
                                if (Q3 > 0) {
                                    F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                    F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                    F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                                } else if (Q3 < 0) {
                                    F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                    F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                    F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                                }
                                if (Q4 > 0) {
                                    F2 = k * (Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                                } else if (Q4 < 0) {
                                    F2 = k * (Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                                }
                            }
                            FRx = F1 + 0 + F3x;
                            FRy = 0 + F2 + F3y;
                            FR = Math.sqrt(Math.pow(FRx, 2) + Math.pow(FRy, 2));

                            tetaFR = Math.toDegrees(Math.abs(Math.atan(FRy / FRx)));
                            if (FRy > 0 && FRx > 0) {
                                tetaFRf = tetaFR;
                            } else if (FRy < 0 && FRx > 0) {
                                tetaFRf = 270 + tetaFR;
                            } else if (FRy > 0 && FRx < 0) {
                                tetaFRf = 180 - tetaFR;
                            } else if (FRy < 0 && FRx < 0) {
                                tetaFRf = 180 + tetaFR;
                            }
                            System.out.println("The resultant vector is: (" + FRx + "," + FRy + ") \n RV magnitude: " + FR + " RV direction: " + tetaFRf);
                            break;
                        }
                    case "3": {
                        if (Q3 > 0) {
                            if (Q1 > 0) {
                                F1 = k * -(Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            } else if (Q1 < 0) {
                                F1 = k * (Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            }
                            if (Q2 > 0) {
                                F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            } else if (Q2 < 0) {
                                F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                            }
                            if (Q4 > 0) {
                                F2 = k * -(Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            } else if (Q4 < 0) {
                                F2 = k * (Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            }
                        } else if (Q3 < 0) {
                            if (Q1 > 0) {
                                F1 = k * (Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            } else if (Q1 < 0) {
                                F1 = k * -(Math.abs(Q1 * Q3) / Math.pow(longitud, 2));
                            }
                            if (Q2 > 0) {
                                F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                            } else if (Q2 < 0) {
                                F3 = k * (Math.abs(Q2 * Q3) / Math.pow(longitud, 2));
                                F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            }
                            if (Q4 > 0) {
                                F2 = k * (Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            } else if (Q4 < 0) {
                                F2 = k * -(Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            }
                        }
                        FRx = 0 + F2 + F3x;
                        FRy = F1 + 0 + F3y;
                        FR = Math.sqrt(Math.pow(FRx, 2) + Math.pow(FRy, 2));

                        tetaFR = Math.toDegrees(Math.abs(Math.atan(FRy / FRx)));
                        if (FRy > 0 && FRx > 0) {
                            tetaFRf = tetaFR;
                        } else if (FRy < 0 && FRx > 0) {
                            tetaFRf = 270 + tetaFR;
                        } else if (FRy > 0 && FRx < 0) {
                            tetaFRf = 180 - tetaFR;
                        } else if (FRy < 0 && FRx < 0) {
                            tetaFRf = 180 + tetaFR;
                        }
                        System.out.println("The resultant vector is: (" + FRx + "," + FRy + ") \n RV magnitude: " + FR + " RV direction: " + tetaFRf);
                        break;
                    }
                    case "4": {
                        if (Q4 > 0) {
                            if (Q1 > 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            } else if (Q1 < 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                            }
                            if (Q2 > 0) {
                                F2 = k * -(Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                            } else if (Q2 < 0) {
                                F2 = k * (Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                            }
                            if (Q3 > 0) {
                                F1 = k * (Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            } else if (Q3 < 0) {
                                F1 = k * -(Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            }
                        } else if (Q4 < 0) {
                            if (Q1 > 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = -(Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = (Math.sin(Math.toRadians(angulo2)) * F3);
                            } else if (Q1 < 0) {
                                F3 = k * (Math.abs(Q1 * Q4) / Math.pow(longitud, 2));
                                F3x = (Math.cos(Math.toRadians(angulo2)) * F3);
                                F3y = -(Math.sin(Math.toRadians(angulo2)) * F3);
                            }
                            if (Q2 > 0) {
                                F2 = k * (Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                            } else if (Q2 < 0) {
                                F2 = k * -(Math.abs(Q2 * Q4) / Math.pow(longitud, 2));
                            }
                            if (Q3 > 0) {
                                F1 = k * -(Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            } else if (Q3 < 0) {
                                F1 = k * (Math.abs(Q3 * Q4) / Math.pow(longitud, 2));
                            }
                        }
                        FRx = F1 + 0 + F3x;
                        FRy = 0 + F2 + F3y;
                        FR = Math.sqrt(Math.pow(FRx, 2) + Math.pow(FRy, 2));

                        tetaFR = Math.toDegrees(Math.abs(Math.atan(FRy / FRx)));
                        if (FRy > 0 && FRx > 0) {
                            tetaFRf = tetaFR;
                        } else if (FRy < 0 && FRx > 0) {
                            tetaFRf = 270 + tetaFR;
                        } else if (FRy > 0 && FRx < 0) {
                            tetaFRf = 180 - tetaFR;
                        } else if (FRy < 0 && FRx < 0) {
                            tetaFRf = 180 + tetaFR;
                        }
                        System.out.println("The resultant vector is: (" + FRx + "," + FRy + ") \n RV magnitude: " + FR + " RV magnitude: " + tetaFRf);
                        break;
                    }
                }
            }
        }
    }
}