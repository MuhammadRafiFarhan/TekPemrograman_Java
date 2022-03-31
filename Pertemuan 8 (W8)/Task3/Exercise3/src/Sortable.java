public abstract class Sortable {
	public abstract int Compare(Sortable b);
	public static void shell_short(Sortable[] a) {
		int n = a.length;
                for (int gap = n/2; gap > 0; gap /= 2){
        	/* Do a gapped insertion sort for this gap size.
                   The first gap elements a[0..gap-1] are already
                   in gapped order keep adding one more element
                   until the entire array is gap sorted */
                    for (int i = gap; i < n; i += 1){
                        Sortable temp = a[i];
                        /* shift earlier gap-sorted elements up until
                           the correct location for a[i] is found */
                        int j;
                        for (j = i; j >= gap && a[j - gap].Compare(temp) < 0; j -= gap)
                            a[j] = a[j - gap];
                            /* put temp (the original a[i]) in its correct
                               location */
                            a[j] = temp;
                    }
                }
        }
}