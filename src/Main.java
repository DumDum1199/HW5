//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1//
        short clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2//
        short clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0&&clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS2==0&&clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else if (clientOS2==1&&clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3//
        int year = 1900;
        boolean a = year  % 100 == 0;
        boolean b = year  % 400 == 0;
        boolean c = year  % 4 == 0;
        if ((year>1584&&b==true)||(year>1584&&c==true)&&a==false) {
                System.out.println("Год  високосный");
            }

        else {
            System.out.println("Год не високосный");
        }


        // Задача 4//
        int deliveryDistance = 19;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        //Задача 5//
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;
                case 2:
                    System.out.println("Сейчас зима");
                    break;
                    case 12:
                        System.out.println("Сейчас зима");
                        break;
                    case 3:
                        System.out.println("Сейчас весна");
                        break;
                    case 4:
                        System.out.println("Сейчас весна");
                        break;
                    case 5:
                        System.out.println("Сейчас весна");
                        break;
                    case 6:
                        System.out.println("Сейчас лето");
                        break;
                    case 7:
                        System.out.println("Сейчас лето");
                        break;
                    case 8:
                        System.out.println("Сейчас лето");
                        break;
                    case 9:
                        System.out.println("Сейчас осень");
                        break;
                    case 10:
                        System.out.println("Сейчас осень");
                        break;
                    case 11:
                        System.out.println("Сейчас осень");
                        break;
                    default:
                        System.out.println("Такого месяца нет");
                }

            }
        }
