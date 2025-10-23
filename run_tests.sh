#!/bin/bash

echo "🧠 Second Largest Unique Number - DSA Problem"
echo "=============================================="
echo ""

echo "📝 Problem: Given an array of integers, return the second largest unique number."
echo "   If it doesn't exist, return -1."
echo ""

echo "🚀 Running all solutions..."
echo ""

# Python Solution
if command -v python3 &> /dev/null; then
    echo "🐍 Python Solution:"
    python3 solution.py
    echo ""
else
    echo "⚠️  Python3 not found, skipping Python solution"
    echo ""
fi

# JavaScript Solution
if command -v node &> /dev/null; then
    echo "🟨 JavaScript Solution:"
    node solution.js
    echo ""
else
    echo "⚠️  Node.js not found, skipping JavaScript solution"
    echo ""
fi

# Java Solution
if command -v javac &> /dev/null && command -v java &> /dev/null; then
    echo "☕ Java Solution:"
    javac Solution.java
    java Solution
    rm -f Solution.class
    echo ""
else
    echo "⚠️  Java not found, skipping Java solution"
    echo ""
fi

echo "✅ All available solutions executed!"
echo ""
echo "📊 Algorithm Analysis:"
echo "   • Time Complexity: O(n) - Single pass through array"
echo "   • Space Complexity: O(1) - Only two variables used"
echo "   • Handles duplicates and edge cases efficiently"