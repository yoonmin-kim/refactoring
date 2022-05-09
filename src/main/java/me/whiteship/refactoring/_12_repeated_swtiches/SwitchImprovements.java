package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    public int vacationHours(String type) {
        int result;
        switch (type) {
            case "full-time": result = 120;
            case "part-time": result = 80;
            case "temporal": result = 32;
            default: result = 0;
        }
        return result;
    }

    public int vacationHours2(String type) {
        return switch (type) {
            case "full-time": yield 120;
            case "part-time": yield 80;
            case "temporal": yield 32;
            default: yield 0;
        };
    }

    public int vacationHours3(String type) {
        return switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default ->  0;
        };
    }
}
