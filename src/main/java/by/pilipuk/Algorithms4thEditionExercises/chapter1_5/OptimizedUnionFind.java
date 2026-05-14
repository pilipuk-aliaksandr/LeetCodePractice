package by.pilipuk.Algorithms4thEditionExercises.chapter1_5;

public class OptimizedUnionFind {
    private final int[] id;
    private int count;
    private final int[] sz;

    public OptimizedUnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }

        sz = new int[n];
        for (int i = 0; i < n; i++) {
            sz[i] = 0;
        }

        count = n;
    }

    public int count() {
        return count;
    }

    private int root(int p) {
        while (id[p] != p) {
            p = id[p];
            sz[p]++;
        }
        return p;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int find(int p) {
        return root(p);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }
        if (sz[p] < sz[q]) {
            id[i] = j;
            sz[p] += sz[q];
        } else {
            id[j] = i;
            sz[q] += sz[p];
        }
        count--;
    }
}