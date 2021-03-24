package com.travel.platform.location;

/**
 * @author Thilina Kalum
 * @since 3/16/2021
 */
public class TagUtils {

  private TagUtils() {
  }

  public static String generateHashTag(String name) {
    String tag = "";
    String[] s = name.replaceAll("[-+.^:,']", "").split(" ");
    for (int i = 0; i < s.length; i++) {
      if (i == 0) {
        tag += s[i].toLowerCase();
      } else {
        tag += s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
      }
    }
    return tag;
  }
}
