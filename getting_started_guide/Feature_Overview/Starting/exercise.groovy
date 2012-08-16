// Vendo o lance das múltiplas Threads...


def i = 0, j = 0;

def f = new File('TheOutput.txt.out');

Thread.start {
	while (true) {
		i++;

		if (i%1000 == 0)
			f << 'S\n';
	}
}

while (true) {
	j++;
	if (j%1000 == 0)
		f << 'M\n'
}