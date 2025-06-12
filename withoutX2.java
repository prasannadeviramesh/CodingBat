public String withoutX2(String str) {
  if (str.length() >= 2) {
    String result = "";

    if (str.charAt(0) != 'x') {
      result += str.charAt(0);
    }
    if (str.charAt(1) != 'x') {
      result += str.charAt(1);
    }

    result += str.substring(2);  // add the rest of the string
    return result;

  } else if (str.length() == 1) {
    // only one character — remove if it's 'x'
    return (str.charAt(0) == 'x') ? "" : str;
  } else {
    return ""; // empty string
  }
}
