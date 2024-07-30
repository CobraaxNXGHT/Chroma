package keystrokesmod.utility.font;

import keystrokesmod.utility.font.impl.FontRenderer;
import keystrokesmod.utility.font.impl.FontUtil;
import keystrokesmod.utility.font.impl.MinecraftFontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import static keystrokesmod.Raven.mc;

import java.util.HashMap;
import java.util.Map;

public class FontManager {
    public static FontRenderer regular16, icon20;
    private static int prevScale;

    public static void init() {
        Map<String, java.awt.Font> locationMap = new HashMap<>();

        ScaledResolution sr = new ScaledResolution(mc);

        int scale = sr.getScaleFactor();

        if (scale != prevScale) {
            prevScale = scale;

            FontManager.regular16 = new FontRenderer(FontUtil.getResource(locationMap, "regular.ttf", 16));
            FontManager.icon20 = new FontRenderer(FontUtil.getResource(locationMap, "icon.ttf", 20));
        }
    }
    public static MinecraftFontRenderer getMinecraft() {
        return MinecraftFontRenderer.INSTANCE;
    }

}