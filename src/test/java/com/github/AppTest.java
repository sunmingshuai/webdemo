package com.github;

import java.util.regex.Pattern;

public class AppTest {

	public static void main(String[] args) {
//		int a = 10;
//		int r = 2;
//		a = a + 3;
//		r = a * a;
//		EmojiParser emojiParser = new EmojiParser();
//		String str = emojiParser.parseToUnicode("确实热闹省心。不过年年如此也很腻味。\uD83D\uDE1C吃来吃去菜就那样");
//		System.out.println(str);
		Pattern EMOJI_PATTERN = Pattern.compile(
				"[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",
				Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
		String str = "一二三四五六七八九十~!";
		System.out.println(str.length());
		System.out.println(str.substring(0,12));
		System.out.println(str.indexOf("~!"));
//		Matcher matcher = EMOJI_PATTERN.matcher(str);
//		if(matcher.find()){
//			System.out.println(matcher.start());
//		}else {
//			System.out.println("not found");
//		}

	}
}
