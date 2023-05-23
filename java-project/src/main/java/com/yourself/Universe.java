// { autofold
package com.yourself;

import java.util.Arrays;

public class Universe {
// }

public static int countAllStars(int... galaxies) {
	int totalStars = 0;
	totalStars = Arrays.stream(galaxies).sum();
	return totalStars;
}

//{ autofold
}
//}
