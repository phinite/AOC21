#include <stdio.h>

int part_1(FILE* fpt) {
	int a, b, i;
	a = b = 0;
	i = -1;

	fscanf(fpt, "%d", &a);
	while ( !feof(fpt) ) {
		if (a > b) ++i;
		b = a;
		fscanf(fpt, "%d", &a);
	}
	return i;
}

int part_2(FILE* fpt) {
	int a, b, c, sa, sb, i;
	a = b = c = sa = sb = 0;
	i = -1;

	while ( !feof(fpt) ) {
		do {
			c = b;
			b = a;
			fscanf(fpt, "%d", &a);
		} while (c == 0;
		sa = a+b+c;
		if (sa > sb) i++;
		sb = sa;
	}
	return i - 1;
}

int main() {
	FILE *fpt1 = fopen("day1_test.txt", "r");
	printf("%d\n", part_1(fpt1));
	fclose(fpt1);
	FILE *fpt2 = fopen("day1_test.txt", "r");
	printf("%d\n", part_2(fpt2));
}


