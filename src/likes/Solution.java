package likes;

class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
    	String list = "";
    	if(names.length == 0)
    		return "no one likes this";
    	if(names.length == 1)
    		return names[0] +  " likes this";
    	if(names.length < 4) {
    		list = names[0];
    		for (int i = 1; i < names.length-1; i++) {
				list = list.concat(", " + names[i]);
    		}
    		return list = list.concat(" and " + names[names.length-1] + " like this");
		} else 
			return list = names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
    }
}