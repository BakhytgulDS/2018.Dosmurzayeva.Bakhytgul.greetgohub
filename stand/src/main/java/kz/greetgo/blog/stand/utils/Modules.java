package kz.greetgo.blog.stand.utils;

import java.io.File;
import java.io.IOException;

public class Modules {

    private static File findDir(String moduleName) {
        {
            File point = new File(".");
            if (point.getAbsoluteFile().getName().equals(moduleName)) {
                return point;
            }
        }

        {
            File dir = new File(moduleName);
            try {
                if (dir.isDirectory() &&
                        dir.toPath().resolve("..").toFile().getCanonicalFile().getName().equals("education.parent")) {
                    return dir;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        {
            File dir = new File("../" + moduleName);
            if (dir.isDirectory()) return dir;
        }

        throw new IllegalArgumentException("Cannot find directory " + moduleName);
    }

    public static File clientDir() {
        return findDir("2018.Dosmurzayeva.Bakhytgul.greetgohub.client");
    }

    public static File standDir() {
        return findDir("2018.Dosmurzayeva.Bakhytgul.greetgohub.stand");
    }

    public static File controllerDir() {
        return findDir("2018.Dosmurzayeva.Bakhytgul.greetgohub.controller");
    }

    public static File samplesDir() {
        return findDir("2018.Dosmurzayeva.Bakhytgul.greetgohub.samples");
    }
}