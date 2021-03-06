package main.java.ru.cti.game;

import main.java.ru.cti.game.weapons.Automate;
import main.java.ru.cti.game.weapons.BigGun;
import main.java.ru.cti.game.weapons.Pistolet;
import main.java.ru.cti.game.weapons.WaterPistol;
import main.java.ru.cti.game.weapons.Weapon;

import java.util.InputMismatchException;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new BigGun(),
                new WaterPistol(),
                new Automate(),
                new Pistolet()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно

        // Получаем оружие из выбранного слота
        while (true) {
            try {
                Weapon weapon = weaponSlots[slot];
                // Огонь!
                weapon.shot();
                break;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Нет такого номера оружия! ");
                break;
            }
        }
    }
}