package com.myPracticeCode;

final pii pair<int, int>
final maxn 100010
final ll long long
public class Zuichanglujin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			private int n;
			private vector<pii> g[maxn];
			private ll f[maxn][2];  //可在dfs过程中用两个变量优化， f[i][0] 表示最大值，f[i][1] 表示次大值
			public void dfs(int x, int fa = 0) {
			        for (auto cur: g[x]) {
			            int v = cur.first, w = cur.second;
			            if (v == fa) continue;
			            dfs(v, x);
			            if (f[x][0] < f[v][0] + w) {
			                f[x][1] = f[x][0];
			                f[x][0] = f[v][0] + w;
			            } else if (f[x][1] < f[v][0] + w){
			                f[x][1] = f[v][0] + w;
			            }
			        }
			    }
			    ll solve(int n, vector<int>& u, vector<int>& v, vector<int>& w) {
			        // write code here
			        for (int i = 0; i < n - 1; ++i) {
			            g[u[i]].push_back({v[i], w[i]});
			            g[v[i]].push_back({u[i], w[i]});
			        }
			        dfs(1, 0);
			        ll res = 0;
			        for (int i = 1; i <= n; ++i) {
			            res = max(res, f[i][0] + f[i][1]);
			        }
			        return res;
			    }

	}

}
